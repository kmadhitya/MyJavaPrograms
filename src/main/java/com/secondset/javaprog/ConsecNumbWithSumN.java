package com.secondset.javaprogram;

public class ConsecNumbWithSumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
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
		

		int start1 = 1;
        int end1 = (n/2) + 1;
        
        int count1 = 1;
        while (start1<end1)
        {
        int sum1 = 0;
        for (int i = start1; i<=end1; i++)
        {
                sum1 = sum1 + i;
                if (sum1 == n)
                {
                    count1++;
                    break;
                }
            if (sum1>n)
            {
					break;
            }
        }
            start1++;
        }
        System.out.println(count1);
	}

}
