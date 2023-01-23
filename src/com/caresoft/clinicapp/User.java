package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    public Integer getId() {
		return id;
	}
    
    // TO DO: Getters and setters
    public void setId(Integer id) {
    	this.id = id;
    }
    public int getPin() {
    	return pin;
    }
    public void setPin(int pin) {
    	this.pin = pin;
    }
    protected int pin;
    // Implement a constructor that takes an ID
	public User(Integer id) {
		this.id = id;
	}
    
}
