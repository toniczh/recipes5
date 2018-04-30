package com.appfront.calculator;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
public class ArithmeticCalculator {
	public double add(double a, double b) {
		return a+b;
	}

}
