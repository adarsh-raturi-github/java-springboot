package com.demo.springdemoapp.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private Computer com;
    @Autowired
    @Qualifier("dektop")
    void setCom(Computer c)
    {
        this.com=c;
    }
    public void code()
    {
     com.compile(); 
     System.out.println("Coding");
    }
}
