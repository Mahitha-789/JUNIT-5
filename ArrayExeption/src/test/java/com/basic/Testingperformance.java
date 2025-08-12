package com.basic;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class Testingperformance {

	@Test
	void testsortingarray_performanace() 
	{
		Sortingarray array=new Sortingarray();
		int unsorted[]= {2,5,1};
		assertTimeout(Duration.ofMillis(100), ()->array.sortingArray(unsorted));
		
	}

}
