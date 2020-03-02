package test.java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import main.java.Calculator;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator Ob = new Calculator();
		int act = Ob.add(2,4);
		assertTrue(6==act);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {	
		Calculator Ob = new Calculator();
		Ob.neg_test(-3, -1);
		System.out.println("Inside testPrintMessage()");         
	}
	
}
