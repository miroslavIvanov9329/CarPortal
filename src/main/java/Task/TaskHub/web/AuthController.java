package Task.TaskHub.web;

import Task.TaskHub.model.dto.UserDTO;
import Task.TaskHub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Task.TaskHub.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public UserDTO register(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return new UserDTO(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail(), savedUser.getRoles());
    }
}
