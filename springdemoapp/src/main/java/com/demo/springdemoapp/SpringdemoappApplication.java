package com.demo.springdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springdemoapp.models.Laptop;
import com.demo.springdemoapp.services.LaptopService;

@SpringBootApplication
public class SpringdemoappApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringdemoappApplication.class, args);
		// Alien obj=context.getBean(Alien.class);
		// System.out.println("hello world");

		LaptopService lapService=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
        lapService.addLaptop(lap);
		
		//obj.code();
	}

}
