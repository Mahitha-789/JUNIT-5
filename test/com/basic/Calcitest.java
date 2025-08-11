package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcitest {

	@Test
	void test() 
	{
		Calc c=new Calc();
		int actual=c.divide(10,5);
		int expected=2;
		assertEquals(expected,actual);
		
	}

}
