package com.demo.springdemoapp.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop  implements Computer{
    
    @Override
    public void compile()
    {
        System.out.println("Compile... in latop");
    }
}
