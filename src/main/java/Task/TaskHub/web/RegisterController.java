package Task.TaskHub.web;

import Task.TaskHub.model.dto.UserDTO;
import Task.TaskHub.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class RegisterController {
    
    private RegisterService registerService;
    
    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    
    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }
    
    @PostMapping("/register")
    public ModelAndView registerUser(@ModelAttribute UserDTO userDTO) {
        boolean isRegistered = registerService.register(userDTO);
        if (isRegistered) {
            return new ModelAndView("redirect:/auth/login").addObject("success", "Registration successful! Please log in.");
        } else {
            return new ModelAndView("register").addObject("error", "Username already exists.");
        }
    }
}
