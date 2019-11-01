package com.fourthset.specialprog;

import org.testng.annotations.Test;

public class UnboundedBoundedExecution {
	
	@Test(priority=1)
	public void typeCastInteger()
	{
		UnboundedTypeClass<Integer,String> obj1 = new UnboundedTypeClass<Integer,String>();
		obj1.number(10);
		
	}
	@Test(priority=2)
	public void typeCastIntAndString()
	{
		UnboundedTypeClass<Integer,String> obj1 = new UnboundedTypeClass<Integer,String>();
		UnboundedTypeClass<Integer,String> obj2 = new UnboundedTypeClass<Integer,String>();
		obj1.number(20);
		obj2.word(200,"Type Casting Program");
	}
	
	@Test(priority=3)
	public static void boundedTypeCastInteger()
	{
		BoundedTypeClass<Integer,Integer> obj1 = new BoundedTypeClass<Integer,Integer>();
		obj1.number(30,70);
		
	}
	@Test(enabled=false)
	public void boundedTypeCastIntAndString()
	{
		BoundedTypeClass<Integer,Integer> obj1 = new BoundedTypeClass<Integer,Integer>();
		//BoundedTypeClass<String> obj2 = new BoundedTypeClass<String>();
	}

}
