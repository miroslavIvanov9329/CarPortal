package Task.TaskHub.model.dto;

import java.util.List;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private Set<String> roles;
    private List<CarDTO> carsList;
    
    public UserDTO(Long id, String username, String email, Set<String> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
    
    public UserDTO(Long id, String username, String email, Set<String> roles, List<CarDTO> carsList) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.carsList = carsList;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set<String> getRoles() {
        return roles;
    }
    
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
    public List<CarDTO> getCarsList() {
        return carsList;
    }
    
    public void setCarsList(List<CarDTO> carsList) {
        this.carsList = carsList;
    }
}
