package com.demo.springdemoapp.repository;

import org.springframework.stereotype.Repository;

import com.demo.springdemoapp.models.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop l)
    {
        System.out.println("Saving laptop");
    }
}
