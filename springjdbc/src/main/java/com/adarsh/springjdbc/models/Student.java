package com.adarsh.springjdbc.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int rollNo;
    private int marks;
    private String name;

    public int getRollNo()
    {
        return this.rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }

    public int getMarks()
    {
        return this.marks;
    }

    public void setMarks(int marks)
    {
        this.marks=marks;
    }

     public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
