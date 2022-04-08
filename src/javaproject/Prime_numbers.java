package javaproject;

public class Prime_numbers {

	public static void main(String[] args) {
		
		
		int j; int i;
		for (i=0;i<=100;i++)  //i=1
		{
			int  b =0;	       //b=0
			
		
		for(j=i;j>=1;j--)      //j=0
		
		{
			if (i%j==0) {
				b=b+1;         //b=1
				
		} 
			
		}
		
		if (b==2) 
		{
				System.out.println(i);
			}
			
		
		
		
		}

	}

}
