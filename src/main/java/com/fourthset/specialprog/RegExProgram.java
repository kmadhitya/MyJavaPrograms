package com.fourthset.specialprog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegExProgram {
	@Test(enabled=false)
	public void extractOnlyNumbers()
	{
		String amazonEmployees = "Amazon 	has	more than  50,000 employees";
		System.out.println(amazonEmployees.replaceAll("\\D", ""));
	}
	@Test(enabled=false)
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
		String email = "kmadhitya@gmail.com";
		String emailSignature = "[a-z]+@[a-z]+.[a-z]{2,3}";
		Pattern compile = Pattern.compile(emailSignature);
		Matcher matcher = compile.matcher(email);
		boolean matches1 = Pattern.matches(emailSignature, email);
		System.out.println(matcher.matches());
		System.out.println(matches1);
	}
	

}
