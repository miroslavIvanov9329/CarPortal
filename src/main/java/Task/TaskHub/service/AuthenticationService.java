package Task.TaskHub.service;

import Task.TaskHub.model.User;
import Task.TaskHub.model.dto.UserLoginDTO;
import Task.TaskHub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {
    private UserRepository userRepository;
    private Pbkdf2PasswordEncoder passwordEncoder;
    
    @Autowired
    public AuthenticationService(UserRepository userRepository, Pbkdf2PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public boolean validateUser(UserLoginDTO userDTO) {
        Optional<User> user = userRepository.findByUsername(userDTO.getUsername());
        return user.isPresent() && passwordEncoder.matches(userDTO.getPassword(), user.get().getPassword());
    }
}
