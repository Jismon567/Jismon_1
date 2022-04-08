package javaproject;

public class CS4 {
 int a;
 int b;
 int c;
 
	public static void main(String[] args) {
		
CS4 c = new CS4();
c.addition();

CS4 c1 = new CS4(30);
c1.addition();
	
	CS4 c2 =new CS4(30, 30);
	c2.addition();
	
	CS4 c3 =new CS4(20, 25, 30);
	c3.addition();
	}
	public CS4()
	{
		a=10;
		b=20;
		c=30;
		
		System.out.println("User defined without parameter constructor is running");
	}
	
	public CS4(int num)
	{
		a=num;
		
		
		System.out.println("User defined with 1 parameter constructor is running");
	}
	public CS4(int num, int num1)
	{
		a=num;
		b=num1;
		
		System.out.println("User defined with 2 parameter constructor is running");
	}
	public CS4(int num, int num1, int num2)
	{
		a=num;
		b=num1;
	    c=num2;	
		System.out.println("User defined with 3 parameter constructor is running");
	}
	public void addition()
	{	
		int sum;
     sum = a+b+c;
     System.out.println("Addition is"+sum);
	}
	
}
