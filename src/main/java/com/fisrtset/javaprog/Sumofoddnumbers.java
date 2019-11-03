package com.fisrtset.javaprog;

import org.testng.annotations.Test;

public class Sumofoddnumbers {

	@Test(enabled = true)
	public void practiceOddNumBetARange() {
		//print odd numbers and sum of odd numbers between a range
		int start = 1;
		int end = 10;
		int sum = 0;
		System.out.print("Odd Numbers are: ");
		for (int i=start; i<=end; i++)
		{
			if (i%2!=0)
			{
				sum = sum + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Sum of Odd Numbers: "+sum);

	}

}
