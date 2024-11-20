package Task.TaskHub.repository;

import Task.TaskHub.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMakeAndModelAndYearAndFuelType(String make, String model, int year, String fuelType);
}
