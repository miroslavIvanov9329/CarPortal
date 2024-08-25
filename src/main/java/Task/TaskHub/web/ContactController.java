package Task.TaskHub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
    
    @GetMapping("/contact-us")
    public ModelAndView contact() {
        return new ModelAndView("contact-us");
    }
}
