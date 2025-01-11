package Task.TaskHub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SellController {
    
    @GetMapping("/sell")
    public ModelAndView sell() {
        
        
        
        
        return new ModelAndView("sell");
    }
}
