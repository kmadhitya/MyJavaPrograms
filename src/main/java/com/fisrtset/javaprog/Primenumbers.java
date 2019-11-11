package com.fisrtset.javaprog;

import org.testng.annotations.Test;
public class Primenumbers {
	@Test(enabled=false)
	public void findPrimeNumbers() {
		int low = 1;
		int high = 100;
		while (low<high)
		{
			boolean flag=false;
			for (int i=2; i<=low/2; i++)
			{				
				if (low%i == 0)
				{
					flag = true;
					break;
				}
			}
			if (flag==false)
			
				System.out.println(low);
				++low;
			
		}
	}
		@Test(enabled=false)
		public void practiceFindPrimeNumbers() 
		{
			int from = 0;
			int till = 100;
			
			for(int i=from; i<=till; i++)
			{
				int count = 0;
				for(int j=1; j<=i; j++)
				{
					if(i%j==0)
					{
						++count;
					}
				}
				if(count==2)
				{
					System.out.print(i+" ");
				}
			}
		}
		@Test(enabled=false)
		public void primeNumberOrNot() 
		{
			
		int high = 7;
		int count = 0;
		for(int i=1; i<=high; i++)
		{
			if(high%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println(high+"is a prime number");
		}
		else
		{
			System.out.println(high+"is not a prime number");
		}
		}
		@Test(enabled=true)
		public void practicePrimeNumberOrNot() 
		{
			int number = 1;
			int count = 0;
			for (int i=1; i<=number; i++)
			{
				
				if(number%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(number+" is a Prime");
			}
			else
			{
				System.out.println(number+" is not a Prime");
			}
		}
}
