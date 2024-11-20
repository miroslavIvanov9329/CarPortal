package Task.TaskHub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String make;
    
    @NotBlank
    private String model;
    
    @Min(1886)
    private int year;
    
    @NotBlank
    private String fuelType;
    
    @Min(1)
    private int horsepower;
    
    @NotBlank
    private String coupeType;
    
    @Column(length = 1000)
    private String description;
    
    private LocalDateTime listedAt = LocalDateTime.now();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    
    public String getCoupeType() {
        return coupeType;
    }
    
    public void setCoupeType(String coupeType) {
        this.coupeType = coupeType;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public LocalDateTime getListedAt() {
        return listedAt;
    }
    
    public void setListedAt(LocalDateTime listedAt) {
        this.listedAt = listedAt;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
}
