package com.appfront.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//@Aspect depends on AspectJ runtime
@Aspect
public class ArithmeticBeforeLoggingAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* ArithmeticCalculator.add(..))")
	public void logBefore() {
		logger.info("Execution Addition");
	}

}
