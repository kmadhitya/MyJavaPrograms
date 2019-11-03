package com.fisrtset.javaprog;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class MoveAllZerosToEnd {
	@Test(enabled=false)
	public void movingZerosToEndThruLists() {		
		int[] data = {0,2,1,0,7,7,0,3};
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		for (int eachInt : data)
		{
			list1.add(eachInt);
		}
		System.out.println(list1);
		for (int eachInt : list1)
		{
			if (eachInt!=0)
			{
				
				list2.add(eachInt);
				
			}
		}
		for (int eachInt : list1)
		{
			if (eachInt==0)
			{
				list2.add(0);
			}
		}
		System.out.println(list1);
		System.out.println(list2);
	}
	
	@Test
	public void movingZerosToEnd()
	{
		int[] data = {0,2,1,0,7,7,0,3};
		int count = 0;
		for (int i=0; i<data.length; i++)
		{
			if (data[i]!=0)
			{
				System.out.print(data[i]+" ");
			}
			else 
			{
				++count;
			}
		}
		while (count>0)
		{
			System.out.print("0 ");
			count--;
		}
	}

}
