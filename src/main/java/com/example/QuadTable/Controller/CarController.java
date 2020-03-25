package com.example.QuadTable.Controller;

import com.example.QuadTable.Model.Book;
import com.example.QuadTable.Model.Car;
import com.example.QuadTable.Model.Employee;
import com.example.QuadTable.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/createCar")
    private Car createBookData(@RequestBody Car car){
        return carService.createBookDetail(car);
    }

    @GetMapping("/getCar")
    public List<Car> findAll() {
        return carService.findAll();
    }

    @DeleteMapping("/deleteCar")
    public void delete(@RequestParam("car_number")int car_number){
        carService.delete(car_number);
    }

}
