package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class shapestestcase {
	shapes Shape=new shapes();

	@Test
	void testSqaure() {
		assertEquals((double) 25,Shape.computeSquareArea(5));
		
	}
	@Test
	void testCircle() {
		assertEquals(78.5,Shape.computeCircleArea(5));
		assertEquals(78.5,Shape.computeCircleArea(-1),"Testcase failed");
	}

}
