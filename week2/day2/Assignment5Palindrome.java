package week2.day2;

public class Assignment5Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="madam";
		String reverse="";
		
	     int length = original.length(); 
	     
	      for (int i =length-1; i >= 0; i--)  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("The String is a palindrome.");  
	      else  
	         System.out.println("The String is not a palindrome.");   

	}

}
