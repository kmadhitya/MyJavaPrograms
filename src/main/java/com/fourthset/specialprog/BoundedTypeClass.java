package com.fourthset.specialprog;



import org.testng.annotations.Test;

public class BoundedTypeClass<T,U extends Number> {
	
	@Test
	public void number(Integer T, Integer U)
	{
		System.out.println("Addition op on the Bounbded class is: "+(T+U));
	}
	@Test
	public void word(String T)
	{
		System.out.println("The word on the Bounded class is: "+T);
	}

}
