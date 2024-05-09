package com.demo.springdemoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springdemoapp.models.Laptop;
import com.demo.springdemoapp.repository.LaptopRepository;

@Service
public class LaptopService
{
    @Autowired
    private LaptopRepository lapRepo;
    public void addLaptop(Laptop l)
    {
        lapRepo.save(l);
        System.out.println("Laptop added..");
    }
    
}