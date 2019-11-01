package com.fourthset.specialprog;

import org.testng.annotations.Test;

public class SuperClass {
	int superVar = 10;
	String superStr = "Super String";
	
	SuperClass()
	{
		this(30);
		System.out.println("Super class Cons call with super() method");
	}
	SuperClass(int i)
	{
		this.superVar = i;
		System.out.println("Current class Cons call with this() method: "+this.superVar);
	}
	@Test
	public void superMethod()
	{
		
		this.superVar = 20;
		this.superStr = "Super String Changed";
		
	}

}
