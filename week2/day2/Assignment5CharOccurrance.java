package week2.day2;

public class Assignment5CharOccurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt="Learning Selenium is Good";
		int count = 0;
		
		char[] arr = txt.toCharArray();
		char check='e';
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==(check))
			{
				count=count+1;
			}
		}
		System.out.println("The count of Occurrence of "+check+" is "+count);
	}

}
