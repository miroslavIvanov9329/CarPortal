package Task.TaskHub.web;

import Task.TaskHub.model.CurrentUser;
import Task.TaskHub.model.dto.UserLoginDTO;
import Task.TaskHub.service.AuthenticationService;
import Task.TaskHub.service.RegisterService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes("currentUser")
public class LoginController {
    private AuthenticationService authenticationService;
    
    @Autowired
    public LoginController(RegisterService registerService, AuthenticationService authenticationService) {
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
            CurrentUser currentUser = new CurrentUser();
            currentUser.setUsername(username);
            session.setAttribute("currentUser", currentUser.getUsername());
            return new ModelAndView("redirect:/home");
        } else {
            return new ModelAndView("login").addObject("error", "Invalid username or password.");
        }
    }
}
