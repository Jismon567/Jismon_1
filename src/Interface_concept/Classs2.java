package Interface_concept;

public class Classs2 {
	int a=10;//global variable
	static int b=20; 
	final int c=40;
	public static void main(String[] args)
	{
		Classs2 f= new Classs2();	
		f.add();
		
		
		
	}
	public void add()
	{
		a=a+10;
		System.out.println("Updated vlaue of a is "+a);
		b=b+30;
		System.out.println("Updated vlaue of b is "+b);
		//c=c+90;--> we cant change values of final variables
	

}

		}



