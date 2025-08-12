package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testexception {

	@Test
	void test() 
	{
	
		Sortingarray array=new Sortingarray();
		int unsorted[]= {2,1,4};
		int sortedArray[]=array.sortingArray(unsorted);
		for(int elem:sortedArray)
		{
			System.out.print(elem);
			
		}
		}
		

		
		
	}


