package com.secondset.javaprogram;

public class SubArraySum {

	public static void main(String[] args) {
		//int[] nums = {1,1,1};
		//int k =2;
		//int[] nums = {1,2,3};
		//int k = 3;
		int[] nums = {3,4,7,2,-3,1,4,2};
		int k = 7;
		subArraySum2(nums,k);
	}
	static void subArraySum2(int[] nums, int k)
	{
		int count = 0 ;
		
		for (int i=0; i<nums.length; i++)
		{
			int sum = 0;
			for (int j=i; j<nums.length; j++)
			{
				sum = sum + nums[j];
				if (sum==k)
				{
					count++;
				}					
			}
		}
		System.out.println(count);
	}
	static void subArraySum1(int[] nums, int k)
	{
		int count = 0;
		for (int i=0; i<nums.length; i++)
		{
			int sum = 0;
			for (int j=i; j>=0; j--)
			{
				sum = sum + nums[j];
				if (sum==k)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
