package com.fisrtset.javaprog;

import org.testng.annotations.Test;

public class StarPatternInReverse {

	
		/*
		 *	*******
		 *   *****
		 *    ***
		 *     *
		 */
		
		@Test(enabled=false,priority=1)
		public void rightTriangle()
		{
			int n=5;
			for (int i=0; i<=n; i++)
			{
				for (int j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		@Test(enabled=false,priority=2)
		public void invertedRightTriangle()
		{
			int n=5;
			for (int i=n; i>=0; i--)
			{
				for (int j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		@Test(enabled=true,priority=3)
		public void equiTriangle()
		{
			int n=5;
			for (int i=0; i<=n; i++)
			{
				for (int j=n-i; j>=0; j--)
				{
					System.out.print(" ");
				}
				for (int j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		@Test(enabled=true,priority=4)
		public void invertedEquiTriangle()
		{
			int n=5;
			for (int i=n; i>=0; i--)
			{
				for (int j=n-i; j>=0; j--)
				{
					System.out.print(" ");
				}
				for (int j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}

}
