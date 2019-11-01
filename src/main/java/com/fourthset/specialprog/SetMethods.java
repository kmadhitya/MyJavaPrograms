package com.fourthset.specialprog;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;
public class SetMethods {
	@Test(enabled=true)
	public void treeSetInt()
	{
	
	Set<Integer> set = new TreeSet<Integer>(new IntegerMyComparator());
	for (int i=8; i>=0; i--)
	{
		set.add(i);
	}
	System.out.println("TreeSet: "+set);
	}
	@Test(enabled=true)
	public void treeSetString()
	{
	
	Set<String> set = new TreeSet<String>(new StringMyComparator());
	for (int i=8; i>=0; i--)
	{
		set.add("Adhi"+i);
	}
	System.out.println("TreeSet: "+set);
	}
	@Test(enabled=true)
	public void linkedHashSetMethods()
	{
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	for (int i=10; i>=0; i--)
	{
		set.add(i);
	}
	System.out.println("LinkedHashSet: "+set);
	}

}
