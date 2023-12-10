package Task.TaskHub.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacturers")
public class Manufacturer extends BaseEntity{
    
    private String name;
    private String countryOfOrigin;
    private int foundedYear;
    private String description;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public int getFoundedYear() {
        return foundedYear;
    }
    
    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
