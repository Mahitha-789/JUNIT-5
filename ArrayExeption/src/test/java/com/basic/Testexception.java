package com.basic;

import org.junit.jupiter.api.Test;

class Testexception {

	@Test
	void test() 
	{
		try {
		Sortingarray array=new Sortingarray();
		int unsorted[]= null;
		int sortedArray[]=array.sortingArray(unsorted);
		for(int elem:sortedArray)
		{
			System.out.print(elem);
				}
		System.out.println("Statements below exeception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception genarated");
			
		}
		
		
		
	}

}
