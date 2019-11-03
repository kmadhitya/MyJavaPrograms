package com.fisrtset.javaprog;

import org.testng.annotations.Test;

public class SumAndOdd {
	@Test(enabled = false)
	public void sumOfNumbers() {
		int y = 0;
		for (int x = 1; x <= 10; x++) {
			y = y + x;
			if (x == 10) {
				System.out.println("Sum of 1 to 10 is: " + y);
			}
		}
	}

	@Test(enabled = false)
	public void oddNumBetweenRange() {
		System.out.println("Odd numbers between 10 to 20 are:");
		for (int a = 10; a <= 20; a++) {
			if (a % 2 == 1) {

				System.out.println(a);
			}
		}
	}

	@Test(enabled = false)
	public void practiceSum() {
		//sum of numbers between any range
		int start = 1;
		int end = 4;
		int sum = 0;
		for (int i=start; i<=end; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

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
