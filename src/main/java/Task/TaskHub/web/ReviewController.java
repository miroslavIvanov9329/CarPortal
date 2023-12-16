package Task.TaskHub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {
    
    @GetMapping("/reviews")
    public ModelAndView reviews() {
        return new ModelAndView("reviews");
    }
}
