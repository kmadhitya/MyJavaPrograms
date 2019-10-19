package com.fourthset.specialprog;

import org.testng.annotations.Test;

public class RegExProgram {
	@Test
	public void extractOnlyNumbers()
	{
		String amazonEmployees = "Amazon 	has	more than  50,000 employees";
		System.out.println(amazonEmployees.replaceAll("\\D", ""));
	}
	@Test
	public void printAllWords()
	{
		String amazonEmployees = "Amazon	has	more than  50,000 employees";
		String[] split = amazonEmployees.split("\\s");
		for(String str: split)
		{
			System.out.println(str);
		}
	}
	@Test
	public void setEmailSignature()
	{
		
	}
	

}
