package Practise1;

public class palindrom_st {

	public static void main(String[] args) {
	
		String	 a= "123";
		String   b="";
		for(int i=a.length()-1; i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		if(a.equals(b)) {
			System.out.println("given string is palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}


}
