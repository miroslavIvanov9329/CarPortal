package Task.TaskHub.service;

import jakarta.transaction.Transactional;
import Task.TaskHub.model.Car;
import Task.TaskHub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Task.TaskHub.repository.CarRepository;
import Task.TaskHub.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private CarRepository carRepository;
    
    @Transactional
    public User registerUser(User user) {
        //TODO
        // Additional registration logic, e.g., encoding password, assigning default role
        Optional<User> byId = userRepository.findById(user.getId());
        
        if(byId.isPresent()) {
            throw new IllegalArgumentException("User already exists in the system.");
        }
    
        return userRepository.save(user);
    }
    
    public void addCarToUser(Long userId, Car car) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
        
        car.setUser(user);  // Set the user in the car
        carRepository.save(car);  // Save the car to persist relationship
    }
    
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
    
    public Optional<User> findByIdWithCars(Long id) {
        return userRepository.findByIdWithCars(id);
    }
    
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
