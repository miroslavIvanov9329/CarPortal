package Task.TaskHub.web;



import Task.TaskHub.model.Car;
import Task.TaskHub.model.User;
import Task.TaskHub.model.dto.CarDTO;
import Task.TaskHub.model.dto.UserDTO;
import Task.TaskHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    // Get user profile by ID
    @GetMapping("/{id}")
    public UserDTO getUserProfile(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            return new UserDTO(
                    user.get().getId(),
                    user.get().getUsername(),
                    user.get().getEmail(),
                    user.get().getRoles()
            );
        } else {
            throw new RuntimeException("User not found with ID: " + id); // Custom exception handling would be ideal here
        }
    }
    
    // Get user details along with the cars they have listed
    @GetMapping("/{id}/cars")
    public UserDTO getUserWithCars(@PathVariable Long id) {
        Optional<User> user = userService.findByIdWithCars(id);
        if (user.isPresent()) {
            User u = user.get();
            
            List<Car> userCars = u.getCars();
            
            return new UserDTO(
                    u.getId(),
                    u.getUsername(),
                    u.getEmail(),
                    u.getRoles(),
                    userCars.stream().map(car -> new CarDTO(
                            car.getId(),
                            car.getMake(),
                            car.getModel(),
                            car.getYear(),
                            car.getFuelType(),
                            car.getHorsepower(),
                            car.getCoupeType(),
                            car.getDescription()
                    )).collect(Collectors.toList())
                    );
        } else {
            throw new RuntimeException("User not found with ID: " + id);
        }
    }
    
    // Update user's profile (e.g., email or username)
    @PutMapping("/{id}")
    public UserDTO updateUserProfile(@PathVariable Long id, @RequestBody UserDTO userDto) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            User u = user.get();
            u.setEmail(userDto.getEmail());
            u.setUsername(userDto.getUsername());
            userService.updateUser(u);
            
            return new UserDTO(u.getId(), u.getUsername(), u.getEmail(), u.getRoles());
        } else {
            throw new RuntimeException("User not found with ID: " + id);
        }
    }
    
    // Delete user account
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "User with ID " + id + " has been deleted successfully";
    }
}
