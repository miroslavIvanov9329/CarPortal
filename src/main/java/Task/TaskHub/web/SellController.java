package Task.TaskHub.web;

import Task.TaskHub.model.entity.dto.SellCarDTO;
import Task.TaskHub.service.SellService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SellController {
    
    private SellService sellService;
    
    public SellController(SellService sellService) {
        this.sellService = sellService;
    }
    
    @GetMapping("/sell/car")
    public ModelAndView sellCar() {
        return new ModelAndView("sell");
    }
    
    @PostMapping("/sell/car")
    public ModelAndView sellCar(SellCarDTO sellCarDTO) {
        
        return new ModelAndView("submission");
    }
}
