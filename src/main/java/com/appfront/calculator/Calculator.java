package com.appfront.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Calculator {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CalculatorConfig.class);
		ArithmeticCalculator arithmeticCalculator = ctx.getBean("arithmeticCalculator",ArithmeticCalculator.class);
		System.out.println("The sum of 3 and 5 =" + arithmeticCalculator.add(3, 5));
		ctx.close();

	}

}
