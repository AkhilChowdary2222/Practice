package com.klu;

public class Bike {
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void drive() {
		engine.start();
		System.out.println("Initiated Bike drive....");
	}

}