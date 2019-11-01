package com.fourthset.specialprog;

import org.testng.annotations.Test;

public class ThisClass extends SuperClass{
	int thisVar = 40;
	
	ThisClass()
	{
		super();
		System.out.println("Current class Constructor");
	}
	@Test
	public void callSuper()
	{
		
		System.out.println("Super class instance variables: "+super.superVar+" "+super.superStr);
		
	}
	@Test
	public void callThis()
	{
		System.out.println("This class instance variable: "+this.thisVar);
		
	}
	

}
