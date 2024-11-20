package Task.TaskHub.model.dto;

public class ServiceDTO {

    String fullName;
    String email;
    String phone;
    double income;
    
    public ServiceDTO() {
    }
    
    public ServiceDTO(String fullName, String email, String phone, double income) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.income = income;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public double getIncome() {
        return income;
    }
    
    public void setIncome(double income) {
        this.income = income;
    }
}
