package com.example.QuadTable.Model;

import org.springframework.data.relational.core.sql.In;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer car_number;
    private String car_name;
    private String car_engine;

    public Car() {
    }

    public Integer getCar_number() {
        return car_number;
    }

    public void setCar_number(Integer car_number) {
        this.car_number = car_number;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_engine() {
        return car_engine;
    }

    public void setCar_engine(String car_engine) {
        this.car_engine = car_engine;
    }
}
