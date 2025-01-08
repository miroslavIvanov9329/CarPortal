package Task.TaskHub.web;

import Task.TaskHub.model.dto.UserLoginDTO;
import Task.TaskHub.service.AuthenticationService;
import Task.TaskHub.service.RegisterService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    
    private RegisterService registerService;
    private AuthenticationService authenticationService;
    
    @Autowired
    public LoginController(RegisterService registerService, AuthenticationService authenticationService) {
        this.registerService = registerService;
        this.authenticationService = authenticationService;
    }
    
    @GetMapping("/login")
    public ModelAndView showLoginPage() {
        return new ModelAndView("login");
    }
    
    @PostMapping("/login")
    public ModelAndView login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        boolean isValidUser = authenticationService.validateUser(new UserLoginDTO(username, password));
        if (isValidUser) {
            session.setAttribute("loggedInUser", username);
            return new ModelAndView("redirect:/home");
        } else {
            return new ModelAndView("login").addObject("error", "Invalid username or password.");
        }
    }
    
    @GetMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/home");
    }
}
