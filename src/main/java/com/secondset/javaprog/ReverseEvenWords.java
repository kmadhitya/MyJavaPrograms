package com.secondset.javaprog;

import org.testng.annotations.Test;

public class ReverseEvenWords {
	@Test(enabled=false)
	public void reverseSB() {
		String txt = "I am a software Tester";
		String[] ch = txt.split(" ");
		for (int i=0; i<ch.length; i++) 
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
			else
			{
				String string = ch[i].toString();
				StringBuffer sb = new StringBuffer(string);
				System.out.print(sb.reverse()+" ");
			}
		}

	}
	@Test(enabled=true)
	public void reverse() {
		String txt = "I am a software Tester";
		String txt1 = "";
		String[] ch = txt.split(" ");
		for (int i=0; i<ch.length; i++) 
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
			else
			{
				char[] charArray = ch[i].toString().toCharArray();
				
				for(int j=charArray.length-1; j>=0; j--)
				{
					txt1 = txt1+charArray[j];
				}
				System.out.print(txt1+" ");
			}
		}

	}

}
