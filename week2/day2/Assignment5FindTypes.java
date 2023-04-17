package week2.day2;

public class Assignment5FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String check = "Welcome to $Selenium Learning on #3rd Week's classes-QA";
		int letter=0;
		int space=0;
		int num=0;
		int specialchar=0;
		char[] check1=check.toCharArray();
		
		for(int i=0;i<check1.length;i++)
		{
			if(Character.isLetter(check1[i]))
			{
				letter=letter+1;
			}
			if(Character.isDigit(check1[i]))
			{
				space=space+1;
			}
			if(Character.isSpaceChar(check1[i]))
			{
				num=num+1;
			}
			else
			{
				specialchar=specialchar+1;
			}
			
			
		}
		
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("num: "+num);
		System.out.println("specialchar: "+specialchar);
		
		}

}
