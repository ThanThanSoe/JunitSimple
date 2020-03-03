package com.tts.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorJUnitTest {

	 @Test
	    public void testSum() {
	        int result = Calculator.sum(3, 4);
	 
	        assertEquals(7, result);
	    }
	 
	    @Test
	    public void testDivison() {
	        try {
	            int result = Calculator.divison(10, 2);
	 
	            assertEquals(5, result);
	        } catch (Exception e) {
	            e.printStackTrace(System.err);
	        }
	    }
	 
	    @Test(expected = Exception.class)
	    public void testDivisionException() throws Exception {
	        Calculator.divison(10, 0);
	    }
	 
}
