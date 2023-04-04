package week1.day2;

import java.util.Arrays; 

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);		
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
			
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
		}
		int sum3=sum2-sum1;
		System.out.println("The missing element is " +sum3);

	}

}
