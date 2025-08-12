package com.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;


class Testexception {

	@Test
	void test() 
	{
		try {
		Sortingarray array=new Sortingarray();
		int unsorted[]= {2,8,6} ;
		int sortedArray[]=array.sortingArray(unsorted);
		for(int elem:sortedArray)
		{
			System.out.print(elem);
		}
		System.out.println("Statements below exeception");
		fail();
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception genarated");
			
		}
		
		
		
	}

}
