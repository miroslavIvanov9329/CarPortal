package Task.TaskHub.service;

import Task.TaskHub.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Task.TaskHub.repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    
    public List<Car> searchCars(String make, String model, int year, String fuelType) {
        return carRepository.findByMakeAndModelAndYearAndFuelType(make, model, year, fuelType);
    }
    
    public Car addCar(Car car) {
        return carRepository.save(car);
    }
}
