package Task.TaskHub.web;

import Task.TaskHub.model.dto.ServiceDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ServicesController {
    
    @GetMapping("/services")
    public ModelAndView showServicesPage(Model model) {
        model.addAttribute("serviceDTO", new ServiceDTO());
        return new ModelAndView("services");  // This refers to services.html
    }
    
    @PostMapping("/services/submission")
    public ModelAndView handleFormSubmission(@ModelAttribute ServiceDTO serviceDTO, Model model) {
        // Here you can process the form data (e.g., save it to a database)
        // For demonstration, we simply pass the ServiceDTO back to the model
        model.addAttribute("serviceDTO", serviceDTO);
        
        String email = serviceDTO.getEmail();
        
        // Return a view name (for example, a thank you page or a submission confirmation)
        return new ModelAndView("submission");  // Redirect or render a new page after form submission
    }
}
