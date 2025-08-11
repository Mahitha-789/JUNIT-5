package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcitest {
	Calc c=new Calc();

	@Test
	void testdivide() 
	{
		int actual=c.divide(10,5);
		int expected=2;
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testmultiply() 
	{
		int actual=c.multiply(10,5);
		assertEquals(50,actual);
		
	}

}
