package Task.TaskHub.model;

import org.springframework.web.context.annotation.SessionScope;

@SessionScope
public class CurrentUser {
    String username;
    
    public CurrentUser(String username) {
        this.username = username;
    }
    
    public CurrentUser() {
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
}
