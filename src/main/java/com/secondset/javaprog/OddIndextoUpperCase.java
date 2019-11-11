package com.secondset.javaprog;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class OddIndextoUpperCase {

	@Test(enabled=false)
	public void oddToUpperSB() {
		String name = "changename";
		char[] chr = name.toCharArray();
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i=0; i<chr.length; i++)
		{
			if (i%2==0)
			{
				sb1.append(chr[i]);
			}
			else
			{
				sb2.append(chr[i]);
			}
		}
		String string1 = sb1.toString();
		char[] charArray1 = string1.toCharArray();
		String string2 = sb2.toString();
		String upperCase = string2.toUpperCase();
		char[] charArray2 = upperCase.toCharArray();
		System.out.println(sb1);
		System.out.println(upperCase);
		
		for (int j = 0; j<chr.length/2; j++)
		{
			sb3.append(charArray1[j]);
			sb3.append(charArray2[j]);
		}
		System.out.println(sb3);
	}
	@Test(enabled=true)
	public void oddToUpper() {
		String name = "changename";
		char[] chr = name.toCharArray();
		
		List<Character> list1 = new LinkedList<Character>();
		for(char eachChar : chr)
		{
			list1.add(eachChar);
		}
		for(int i=0; i<list1.size(); i++)
		{
			if (i%2==0)
			{
				System.out.print(list1.get(i));
			}
			else
			{
				System.out.print(list1.get(i).toString().toUpperCase());
			}
		}
		System.out.println();
		
	}

}
