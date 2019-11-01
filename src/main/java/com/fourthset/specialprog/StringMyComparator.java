package com.fourthset.specialprog;

import java.util.Comparator;

import org.testng.annotations.Test;

public class StringMyComparator implements Comparator<String>{

	@Test
	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}
