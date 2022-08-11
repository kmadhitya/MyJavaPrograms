package com.secondset.javaprogram;

public class LongestRepeatingSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  aabbcccd
		String str = "aabbcccd";
		System.out.println(findLongestRepeatingSubSequence(str));
		System.out.println(findLongestRepeatingSubSequencePract(str));
	}
	
	public static int findLongestRepeatingSubSequence(String str)
    {
		String str1 = str;
		String str2 = str;
		int n = str.length();
		int[][] lrs = new int[n+1][n+1];
		
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if (i==0 || j==0)
				{
					lrs[i][j] = 0;
				}
				else if (str1.charAt(i-1)==str2.charAt(j-1) && i!=j)
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
	public static String findLongestRepeatingSubSequencePract(String str)
    {
		String str1 = str;
		String str2 = str;
		int n = str.length();
		String[][] lrs = new String[n+1][n+1];
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if (i==0 || j==0)
				{
					lrs[i][j] = "";
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1) && i!=j)
				{
					lrs[i][j] = lrs[i-1][j-1] + str.charAt(i-1);
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
	
	public static int findLongestRepeatingSubSeq(String str)
    {
        int n = str.length();
  
        // Create and initialize DP table
        int[][] dp = new int[n+1][n+1];
  
        // Fill dp table (similar to LCS loops)
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                // If characters match and indexes are not same
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    dp[i][j] =  1 + dp[i-1][j-1];         
                       
                // If characters do not match
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[n][n];
    }
	
	public static int findLongestRepeatingSubSeqPract(String str)
    {
		String str1 = str;
		String str2 = str;
		int len = str.length();
		int lrs[][] = new int[len+1][len+1];
		
		for (int i=0; i<=len; i++)
		{
			for (int j=0; j<=len; j++)
			{
				if (i==0 || j==0)
				{
					lrs[i][j] = 0;
				}
				else if (str1.charAt(i-1) == str2.charAt(j-1) && i!=j)
				{
					lrs[i][j] = 1 + lrs[i-1][j-1];
				}
				else
				{
					lrs[i][j] = Math.max(lrs[i-1][j], lrs[i][j-1]);
				}
			}
		}
		return lrs[len][len];
    }
	
	public static String findLongestRepeatingSubSeqCharacters(String str)
    {
		String str1 = str;
		String str2 = str;
		int len = str.length();
		String lrs[][] = new String[len+1][len+1];
		
		for (int i=0; i<=len; i++)
		{
			for (int j=0; j<=len; j++)
			{
					lrs[i][j] = "";				
			}
		}
		
		for (int i=0; i<=len; i++)
		{
			for (int j=0; j<=len; j++)
			{
				if(i==0 || j==0)
				{
					lrs[i][j] = "";
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1) && i!=j)
				{
					lrs[i][j] = lrs[i-1][j-1] + str1.charAt(i-1);
				}
				else
				{
					if (lrs[i-1][j] != "" && lrs[i][j-1] != "")
					{
						if (lrs[i-1][j].length() > lrs[i][j-1].length())
							lrs[i][j] = lrs[i-1][j];
						else
							lrs[i][j] = lrs[i][j-1];
					}
					else if (lrs[i-1][j] != "")
					{
						lrs[i][j] = (lrs[i-1][j]).replaceAll(",", "");
					}
					else if (lrs[i][j-1] != "")
					{
						lrs[i][j] = (lrs[i][j-1]).replaceAll(",", "");
					}
				}
			}
		}
		return lrs[len][len];
    }

}
