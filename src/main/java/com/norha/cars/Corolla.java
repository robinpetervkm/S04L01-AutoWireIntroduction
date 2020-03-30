package com.norha.cars;

import org.springframework.stereotype.Component;

import com.norha.interfaces.Car;
@Component("corolla") 			//Always use the lower case for spcify the name of the bean
public class Corolla implements Car  {

	public String specs() {
		return "Sedan from Toyotta";
	}

}
