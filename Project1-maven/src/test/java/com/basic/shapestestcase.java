package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class shapestestcase {

	@Test
	void testSqaure() {
		shapes Shape=new shapes();
		double actual=Shape.computeSquareArea(5);
		double expected= 25;
		assertEquals(expected,actual);
		
	}
	@Test
	void testCircle() {
		shapes Shape=new shapes();
		double actual=Shape.computeCircleArea(5);
		double expected= 78.5;
		assertEquals(expected,actual);
		
	}

}
