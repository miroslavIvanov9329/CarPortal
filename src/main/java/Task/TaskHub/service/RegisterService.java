package Task.TaskHub.service;

import Task.TaskHub.model.User;
import Task.TaskHub.model.dto.UserDTO;
import Task.TaskHub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterService {
    
    private UserRepository userRepository;
    private Pbkdf2PasswordEncoder passwordEncoder;
    
    @Autowired
    public RegisterService(UserRepository userRepository, Pbkdf2PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public boolean register(UserDTO userDTO) {
        Optional<User> existingUser = userRepository.findByUsername(userDTO.getUsername());
        if (existingUser.isPresent()) {
            return false;
        }
        
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(user);
        
        return true;
    }
}
