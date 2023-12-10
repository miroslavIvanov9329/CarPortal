package Task.TaskHub.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_requests")
public class ContactRequest extends BaseEntity{
    
    @ManyToOne
    private Car car;
    
    @ManyToOne
    private User interestedUser;
    
    private String contactInformation;
    private String message;
    private LocalDateTime requestDate;
    private boolean viewed;
    
    public ContactRequest() {
        this.requestDate = LocalDateTime.now();
    }
    
    public Car getCar() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    
    public User getInterestedUser() {
        return interestedUser;
    }
    
    public void setInterestedUser(User interestedUser) {
        this.interestedUser = interestedUser;
    }
    
    public String getContactInformation() {
        return contactInformation;
    }
    
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public LocalDateTime getRequestDate() {
        return requestDate;
    }
    
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
    
    public boolean isViewed() {
        return viewed;
    }
    
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}
