package Task.TaskHub.web;

import Task.TaskHub.model.dto.CarDTO;
import Task.TaskHub.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Task.TaskHub.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;
    
    @GetMapping
    public List<CarDTO> getCars(@RequestParam String make, @RequestParam String model,
                                @RequestParam int year, @RequestParam String fuelType) {
        return carService.searchCars(make, model, year, fuelType).stream()
                .map(car -> new CarDTO(car.getId(), car.getMake(), car.getModel(), car.getYear(),
                        car.getFuelType(), car.getHorsepower(), car.getCoupeType(), car.getDescription()))
                .collect(Collectors.toList());
    }
    
    @PostMapping
    public CarDTO addCar(@RequestBody Car car) {
        Car savedCar = carService.addCar(car);
        return new CarDTO(savedCar.getId(), savedCar.getMake(), savedCar.getModel(), savedCar.getYear(),
                savedCar.getFuelType(), savedCar.getHorsepower(), savedCar.getCoupeType(), savedCar.getDescription());
    }
}
