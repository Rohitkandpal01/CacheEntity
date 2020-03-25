package com.example.QuadTable.Service;

import com.example.QuadTable.Model.Car;
import com.example.QuadTable.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    @CacheEvict(value = "cars", allEntries = true)
    public Car createBookDetail(Car car) {
        return carRepository.save(car);
    }

    @CacheEvict(value = "cars", allEntries = true)
    public void delete(int car_number) {
        carRepository.deleteById(car_number);
    }

    @Cacheable("cars")
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
