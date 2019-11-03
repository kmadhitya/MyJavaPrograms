package com.fisrtset.javaprog;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;

import org.testng.annotations.Test;



public class GreatestOfAllNumbers {
	
	@Test(enabled=false)
	public void greatestOfNumsWithList()
	{
		int[] arr = {5,4,44,88,56,1000,2,1,0,6};
		String str;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int array : arr)
		{
			list.add(array);
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("Greatest num using list:" +list.get(0));
	}
	
	@Test(enabled=false)
	public void greatestOfNums()
	{
		int[] arr = {5,4,44,88,56,1000,2,1,0,6};
		int max = arr[0];
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Greatest num:" +max);
	}
	@Test
	public void greatestOfNumsUsingStream()
	{
		int[] arr = {5,4,44,88,56,1000,2,1,0,6};
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Greatest num using Stream:" +max);
	}

}
