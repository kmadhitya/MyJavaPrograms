package com.fisrtset.javaprog;
public class SumOfTwoIndices {
	public static void main(String[] args) {
		int[] arrDigits = {3,5,6,2,5,1,8,9};
		int target = 7;
		new SumOfTwoIndices().sumOfTwo2(arrDigits, target);

	}
	public void sumOfTwo1(int[] arrDigits,int target)
	{
		System.out.println("The indices are: ");
		for (int i=0; i<arrDigits.length-1; i++)
		{
			for (int j=i+1; j<arrDigits.length; j++)
			{
				if (arrDigits[i]+arrDigits[j]==target)
				{
					System.out.println(arrDigits[i]+", "+arrDigits[j]);
				}
			}
		}
	}
	
	public void sumOfTwo2(int[] arrDigits,int target)
	{
		for (int i=0; i<arrDigits.length-1; i++)
		{
			for (int j=i+1; j<arrDigits.length; j++)
			{
				if(arrDigits[i]+arrDigits[j]==target)
				{
					System.out.println(i+" and "+j+" and the Sum of these 2 indices are: "+(i+j));
				}
			}
		}
	}
	
	
}
