package week2.day2;

import java.util.Arrays;

public class Assignment5Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "HEART";
		String two = "EARTH";
		
		String Result1="";
		String Result2="";
			
			if(one.length()==two.length())
			{
				char[] ch1=one.toCharArray();
				char[] ch2=two.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
				for(int i=0;i<ch1.length;i++)
				{
					Result1=Result1+ch1[i];
					Result2=Result2+ch2[i];
				}
				
				if(Result1.equals(Result2))
				{
					System.out.println("Entered Texts are Anagram");
					
				}
				else
					System.out.println("Entered Texts are not Anagram");
			}
		
		

	}

}
