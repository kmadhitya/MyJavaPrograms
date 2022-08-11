package com.secondset.javaprogram;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdgh";
		String str2 = "aedfhr";
		System.out.println(findLongestCommonSubSequence(str1, str2));
		System.out.println(findLongestCommonSubSequenceString(str1, str2));
	}
	
	public static int findLongestCommonSubSequence(String str1, String str2)
    {
		int n = str1.length();
		int[][] lrs = new int[n+1][n+1];
		
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if (i==0 || j==0)
				{
					lrs[i][j] = 0;
				}
				else if (str1.charAt(i-1)==str2.charAt(j-1))
				{
					lrs[i][j] = 1+lrs[i-1][j-1]; 
				}
				else
				{
					lrs[i][j] = Math.max(lrs[i-1][j], lrs[i][j-1]);
				}
			}
		}
		return lrs[n][n];	
    }
	public static String findLongestCommonSubSequenceString(String str1, String str2)
    {
		int n = str1.length();
		String[][] lrs = new String[n+1][n+1];
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if (i==0 || j==0)
				{
					lrs[i][j] = "";
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					lrs[i][j] = lrs[i-1][j-1] + str1.charAt(i-1);
				}
				else
				{
					if (lrs[i-1][j].length()>lrs[i][j-1].length())
					{
						lrs[i][j] = lrs[i-1][j];
					}
					else
					{
						lrs[i][j] = lrs[i][j-1];
					}
				}
			}
		}
		return lrs[n][n];
    }

}
