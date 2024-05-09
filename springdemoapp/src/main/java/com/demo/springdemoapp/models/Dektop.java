package com.demo.springdemoapp.models;

import org.springframework.stereotype.Component;

@Component
public class Dektop implements Computer {
    public void compile()
    {
        System.out.println("Compiling in Desktop...");
    }
}
