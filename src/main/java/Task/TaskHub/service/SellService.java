package Task.TaskHub.service;

import Task.TaskHub.model.entity.Car;
import Task.TaskHub.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class SellService {
    private CarRepository carRepository;
    
    public void addCarToRepository (Car car) {
        this.carRepository.save(car);
    }
}
