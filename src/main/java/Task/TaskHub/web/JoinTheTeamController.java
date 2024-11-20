package Task.TaskHub.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JoinTheTeamController {
    
    @GetMapping("/join-us")
    public ModelAndView joinUs() {
        return new ModelAndView("join-us");
    }
}
