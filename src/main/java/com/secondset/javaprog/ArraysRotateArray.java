package com.secondset.javaprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArraysRotateArray {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list1.addAll(list2);
		Collections.sort(list1);
		Set<Integer> set = new LinkedHashSet<Integer>(list1);
		//System.out.println(set);
		int nums[] = {1,2,3,4,5,6};
		int k = 3;
		//rotatePract(nums,k);
		int singleNumb[] = {4,1,2,1,2};
		System.out.println(singleNum(singleNumb));
	}
	
	public static int singleNum(int[] nums)
	{
		int result = 0;
        if(nums.length==1)
        {
            return result = nums[0];
        }
            for (int i=0; i<nums.length; i++)
            {
                int count = 0;
                for (int j=0; j<nums.length; j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
                if (count==1)
                    result = nums[i];
            }
        return result;
	}
	
	public static void rotatePract(int[] nums, int k)
	{
		int len = nums.length;
		while (k>0)
		{
			int first = nums[len-1];
			for (int i=len-1; i>0; i--)
			{
				
				nums[i] = nums[i-1];
			}
			nums[0] = first;
			k--;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void rotate(int[] nums, int k) {
        int j=1;
        int[] arr = new int[nums.length];
        int m = k;
        int n = k;
        while (m>=0 && j<=3)
        {
            arr[m-1] = nums[nums.length-j];
            m--;
            j++;
        }
        for(int i=0; i<nums.length-k; i++)
        {
            arr[n] = nums[i];
            n++;
        }
        //for (int i=0; i<arr.length; i++)
       // {
        	//System.out.println(arr[i]);
        //}
        	for (int i=0; i<arr.length; i++)
        	        {
        	        	nums[i] = arr[i];
        	        }
        	System.out.println(Arrays.toString(nums));
        	for (int i=0; i<nums.length; i++)
        	        {
        	        	System.out.println(nums[i]);
        	        }
    }
	

}
