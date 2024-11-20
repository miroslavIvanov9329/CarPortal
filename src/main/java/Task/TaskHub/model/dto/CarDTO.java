package Task.TaskHub.model.dto;

import Task.TaskHub.model.Car;

import java.util.List;

public class CarDTO {
    private Long id;
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private int horsepower;
    private String coupeType;
    private String description;
    private List<Car> cars;
    
    public CarDTO(Long id, String make, String model, int year, String fuelType, int horsepower, String coupeType, String description) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.horsepower = horsepower;
        this.coupeType = coupeType;
        this.description = description;
    }
    
    public CarDTO(Long id, String make, String model, int year, String fuelType, int horsepower, String coupeType, String description, List<Car> cars) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.horsepower = horsepower;
        this.coupeType = coupeType;
        this.description = description;
        this.cars = cars;
    }
    
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
    
    public List<Car> getCars() {
        return cars;
    }
    
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
