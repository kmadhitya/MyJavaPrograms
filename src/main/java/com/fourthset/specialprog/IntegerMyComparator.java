package com.fourthset.specialprog;

import java.util.Comparator;

import org.testng.annotations.Test;

public class IntegerMyComparator implements Comparator<Integer>{

	@Test
	@Override
	public int compare(Integer o1, Integer o2) {
		
		//Integer i1 = (Integer)o1;
		//Integer i2 = (Integer)o2;
		return o2.compareTo(o1);
	}

}
