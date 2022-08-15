package com.secondset.javaprogram;

public class ConsecNumbWithSumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int start = 1;
		int end = (n/2)+1;
		while (start<end)
		{
			int sum = 0;
			for (int i=start; i<=end; i++)
			{
				sum = sum + i;
				if (sum==n)
				{
					for (int j=start; j<=i ; j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
					break;
				}
				if (sum>n)
					break;
			}
			start++;
		}

	}

}
