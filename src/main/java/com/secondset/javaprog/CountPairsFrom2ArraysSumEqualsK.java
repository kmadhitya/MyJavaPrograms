package com.secondset.javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountPairsFrom2ArraysSumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: A1[] = {1, 1, 3, 4, 5, 6, 6}, A2[] = {1, 4, 4, 5, 7}, K = 10 
		//Output: 4 
		int k =10;
		int[] arr1 = {1, 1, 3, 4, 5, 6, 6};
		int[] arr2 = {1, 4, 4, 5, 7};
		int len1 = arr1.length;
		int len2 = arr2.length;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i=0; i<len1; i++)
		{
			if (map.containsKey(arr1[i]))
			{
				map.put(arr1[i], 1+map.get(arr1[i]));
			}
			else
			{
				map.put(arr1[i], 1);
			}
		}
		System.out.println(map);
		int temp = 0;
		int res = 0;
		for (int j=0; j<len2; j++)
		{
			temp = k-arr2[j];
			if (map.containsKey(temp) && map.get(temp)!=0)
			{
				res++;
				map.put(temp, map.get(temp)-1);
				System.out.println("(" + temp + ", " + arr2[j] + ") ");
			}
		}
		System.out.println(res);

	}

}
