package com.fourthset.specialprog;

import java.util.Comparator;

import org.testng.annotations.Test;

public class StringMyComparator implements Comparator<Object>{

	@Test
	@Override
	public int compare(Object o1, Object o2) {
		
		return ((String) o1).compareTo((String) o2);
	}
}
