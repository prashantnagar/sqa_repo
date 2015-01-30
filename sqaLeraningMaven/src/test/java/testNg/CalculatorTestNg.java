package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static_example.Calculator;

public class CalculatorTestNg {
	Logger log = Logger.getLogger(CalculatorTestNg.class);
	Calculator calc = new Calculator();
		
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite Again!!");
		log.info("in beforeSuite Again!!");
		//implement the logic that should get executed before any of your tests are triggered.		
	}
	
	@Test
	public void testAddByNg(){
		System.out.println("Inside testAddByNg");
		log.info("Inside testAddByNg");
		Assert.assertEquals(calc.add(3, 4), 7);
	}
}
