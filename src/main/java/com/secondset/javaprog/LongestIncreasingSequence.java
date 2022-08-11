package com.secondset.javaprogram;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,108,4,6,10};
		lis2(nums);
	}
	
	public static void lis2(int[] nums)
	{
		int[] lis = new int[nums.length];
		for (int i=0; i<nums.length; i++)
		{
			lis[i] = 1;
		}
		int max = 0;
		for(int i=1; i<nums.length; i++)
		{
			for (int j=0; j<i; j++)
			{
				if(nums[i]>nums[j] && lis[i]<=lis[j])
				{
					lis[i] = 1+lis[i];
					if(max<lis[i])
						max = lis[i];
				}
			}
		}
		System.out.println(max);
	}
	
	public static void lis1(int[] nums)
	{
		int[] lis = new int[nums.length];
		for (int k=0; k<nums.length; k++)
		{
			lis[k] = 1;
		}
		for (int i = 1; i<nums.length; i++)
		{
			for (int j= 0; j<i; j++)
			{
				if (nums[i]>nums[j] && lis[i]<=lis[j])
				{
					lis[i] = 1+lis[j];
				}
			}
		}
		int max = 0;
		for (int i=0; i<lis.length; i++)
		{
			if (lis[i]>max)
				max = lis[i];
			}
		System.out.println(max);
	}
	
    //300. Longest Increasing Subsequence - Input: nums = [10,9,2,5,3,7,101,18] - Output: 4
	//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
	//Merge 2 sorted lists - Input: list1 = [1,2,4], list2 = [1,3,4] - Output: [1,1,2,3,4,4]
	//Sort lest - Input: head = [-1,5,3,4,0] - Output: [-1,0,3,4,5]
	//560. Subarray Sum Equals K - Input: nums = [1,1,1], k = 2 - Output: 2
	//Input: nums = [1,2,3], k = 3 - Output: 2
	//Remove Duplicates from Sorted Array - Input: nums = [0,0,1,1,1,2,2,3,3,4] - Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
	//Rotate Array - Input: nums = [1,2,3,4,5,6,7], k = 3 - Output: [5,6,7,1,2,3,4]
	

}
