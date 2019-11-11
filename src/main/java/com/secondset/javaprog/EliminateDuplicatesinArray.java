package com.secondset.javaprog;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class EliminateDuplicatesinArray {
	@Test(enabled=false)
	public void eliminateDupsInSortedArray() {
		int[] arr={1,2,2,3,4,4,4,5,5};
		int[] temp = new int[arr.length];
		int j=0;
		for (int i=0; i<arr.length-1; i++)
				if(arr[i]!=arr[i+1])				
					arr[j++]=arr[i];					
				
				arr[j++]=arr[arr.length-1];
		for (int i=0;i<j;i++)
		{
		System.out.println(arr[i]);
		}
	}
	@Test(enabled=false)
	public void eliminateDupsInUSortedArraySet()
	{
		int[] arr={1,2,66,2,3,4,55,4,4,5,55,5,1};
		Set<Integer> s = new LinkedHashSet<Integer>();
		for(int eachArr : arr)
		{
			s.add(eachArr);
		}
		System.out.println(s);
	}
	@Test(enabled=true)
	public void eliminateDupsInUSortedArrayMap()
	{
		int[] arr={1,2,66,2,3,4,55,4,4,5,55,5,1};
		Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		for(int eachArr : arr)
		{
			if (m.containsKey(eachArr)!=true)
			{
				m.put(eachArr, 1);
			}
		}
		for(Entry<Integer,Integer> eachMap : m.entrySet())
		{
			System.out.print(eachMap.getKey()+" ");
		}
	}
	
}