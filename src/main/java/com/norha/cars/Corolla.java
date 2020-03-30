package com.norha.cars;

import org.springframework.stereotype.Component;

import com.norha.interfaces.Car;
@Component("MyCustomName")
public class Corolla implements Car  {

	public String specs() {
		return "Sedan from Toyotta";
	}

}
