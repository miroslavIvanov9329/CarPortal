package Task.TaskHub.web;

import Task.TaskHub.model.CurrentUser;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
    
    @GetMapping("/home")
    public ModelAndView home(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("index");
        Object currentUser = session.getAttribute("currentUser");

        modelAndView.addObject("currentUser", currentUser);
        return modelAndView;
    }
}
