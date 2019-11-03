package com.fourthset.specialprog;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapExample {
	
	@Test
	public void linkedMapMethods()
	{
		String str = "United States of America";
		String lowerCase = str.toLowerCase();
		String[] split = lowerCase.split(" ");
		String str1 = "";
		for (String s : split)
		{
			str1 = str1+s;
		}
		char[] ch = str1.toCharArray();
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		for (Character chr : ch)
		{
			if (m.containsKey(chr))
			{
				m.put(chr, m.get(chr)+1);
			}
			else
			{
				m.put(chr, 1);
			}
		}
		System.out.println(m);
		
	}
	@Test(enabled=true)
	public void hashMapMethods()
	{
		String str = "United States of America";
		String lowerCase = str.toLowerCase();
		String[] split = lowerCase.split(" ");
		String str1 = "";
		for (String eachCharAr : split)
		{
			str1 = str1 + eachCharAr;
		}
		char[] ch = str1.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for (Character chr : ch)
		{
			if (m.containsKey(chr))
			{
				m.put(chr, m.get(chr)+1);
			}
			else
			{
				m.put(chr, 1);
			}
		}
		System.out.println(m);
	}

}
