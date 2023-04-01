package week1.day1;

public class Fibbinocci {
	
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=0;i<=11;i=i+1)
		{
			sum=firstNum+secNum;
			if(sum>=56)
				break;
			System.out.println(sum);
			
			firstNum=secNum;
			secNum=sum;
			
			
		}
	}

}
