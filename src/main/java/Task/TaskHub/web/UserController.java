package Task.TaskHub.web;



import Task.TaskHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
//    @GetMapping("/{id}")
//    public UserDTO getUserProfile(@PathVariable Long id) {
//        Optional<User> user = userService.findById(id);
//        if (user.isPresent()) {
//            return new UserDTO(
//                    user.get().getId(),
//                    user.get().getUsername(),
//                    user.get().getEmail(),
//                    user.get().getRoles()
//            );
//        } else {
//            throw new RuntimeException("User not found with ID: " + id); // Custom exception handling would be ideal here
//        }
//    }
//
//    @GetMapping("/{id}/cars")
//    public UserDTO getUserWithCars(@PathVariable Long id) {
//        Optional<User> user = userService.findByIdWithCars(id);
//        if (user.isPresent()) {
//            User u = user.get();
//
//            List<Car> userCars = u.getCars();
//
//            return new UserDTO(
//                    u.getId(),
//                    u.getUsername(),
//                    u.getEmail(),
//                    u.getRoles(),
//                    userCars.stream().map(car -> new CarDTO(
//                            car.getId(),
//                            car.getMake(),
//                            car.getModel(),
//                            car.getYear(),
//                            car.getFuelType(),
//                            car.getHorsepower(),
//                            car.getCoupeType(),
//                            car.getDescription()
//                    )).collect(Collectors.toList())
//                    );
//        } else {
//            throw new RuntimeException("User not found with ID: " + id);
//        }
//    }
//
//    @PutMapping("/{id}")
//    public UserDTO updateUserProfile(@PathVariable Long id, @RequestBody UserDTO userDto) {
//        Optional<User> user = userService.findById(id);
//        if (user.isPresent()) {
//            User u = user.get();
//            u.setEmail(userDto.getEmail());
//            u.setUsername(userDto.getUsername());
//            userService.updateUser(u);
//
//            return new UserDTO(u.getId(), u.getUsername(), u.getEmail(), u.getRoles());
//        } else {
//            throw new RuntimeException("User not found with ID: " + id);
//        }
//    }
    
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "User with ID " + id + " has been deleted successfully";
    }
}
