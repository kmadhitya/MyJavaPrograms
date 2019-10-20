package com.fisrtset.javaprog;

import org.testng.annotations.Test;

public class Fibonacci {
	
	@Test(enabled=false)
	public void fib()
	{
		int n=7;
		int n1 = 0;
		int n2 = 1;
		for (int i=0; i<=n; i++)
		{
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
	@Test(enabled=false)
	public void practicefib()
	{
		// 0, 1, 1, 2, 3, 5, 8, 13, 21
		int num = 7;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (int i=0; i<=num; i++)
		{
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		System.out.println();
	}
	@Test
	public void fibWithoutThirdVar()
	{
		// 0, 1, 1, 2, 3, 5, 8, 13, 21
		int num = 10;
		
		int n1 = 0;
		int n2 = 1;
		if (num>=1)
		System.out.print(n1+" "+n2+" ");
		else
			System.out.print(n1+" ");
		
		for (int i=2; i<=num; i++)
		{
			
			System.out.print(n1 + n2+" ");
			n2=n1+n2;
			n1=n2-n1;
			
		}
		System.out.println();
	}

	

}
