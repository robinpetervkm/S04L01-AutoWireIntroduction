package com.norha.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.norha.interfaces.Car;
@Component("myCorolla")
public class Corolla implements Car  {
	
	
	@Autowired
	Engine engine;

	public String specs() {
		
		String speString = "Sedan From Toyota With Engine Type as "+engine.getType();
		return speString;
	}

}
