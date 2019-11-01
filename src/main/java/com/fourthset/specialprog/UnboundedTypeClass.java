package com.fourthset.specialprog;

import org.testng.annotations.Test;

public class UnboundedTypeClass<T,U>{
	
	UnboundedTypeClass()
	{
		System.out.println("Constructor on the Super Class is Invoked");
	}
	@Test
	public void number(Integer T)
	{
		System.out.println("The number on the Unbounded class is: "+T);
	}
	@Test
	public void word(Integer T, String U)
	{
		System.out.println("The number and word on the Unbounded class is: "+T+" and "+U);
	}

}
