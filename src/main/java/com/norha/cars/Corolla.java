package com.norha.cars;

import org.springframework.stereotype.Component;

import com.norha.interfaces.Car;
@Component("MyCustomName")
public class Corolla implements Car  {
	
	Engine engine = new Engine();

	public String specs() {
		
		String speString = "Sedan From Toyota With Engine Type as "+engine.getType();
		return speString;
	}

}
