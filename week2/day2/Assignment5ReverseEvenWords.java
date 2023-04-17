package week2.day2;

public class Assignment5ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "QA Automation training for experienced professionals";
		char ch;
		
		String updated="",nstr="";
		String[] splittest=test.split(" ");
		for (int i=0;i<splittest.length;i++)
		{
			if((i+1)%2==0)
			{
				for(int j=0;j<splittest[i].length();j++)
				{
					ch=splittest[i].charAt(j);
					nstr=ch+nstr;
				}
			}
			else
			{
				nstr=splittest[i];
			}
			updated=updated+" "+nstr;
			nstr="";
		}
		System.out.println("Reversed Even words: "+updated);

	}

}
