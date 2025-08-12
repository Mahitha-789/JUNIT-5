package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testArrays {

	@Test
	void testArray() 
	{
		int []expected= {2,4,6,8};
		int []actual= {4,8,6,2};
		assertEquals(expected,actual);
	}

}
