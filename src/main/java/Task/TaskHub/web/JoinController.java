package Task.TaskHub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoinController {
    @GetMapping("/join-us")
    public ModelAndView joinUs() {
        return new ModelAndView("join-us");
    }
}
