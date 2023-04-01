package week1.day1;

public class isPrime {
	public static void main(String[] args) {
		int n=10;
		int count=0;
		for(int i=2;i<=n-1;i=i+1)
			{
			if(n%i==0)
			{
				count=count+1;
			}		
				
		}
		if(count>0) {
			System.out.println("The number is Not Prime");
		}
		else {
			System.out.println("The number is Prime");
		}
	}

}
