package Polymorphism;

public class C {
public static void main(String[] args) {
		
		C t= new C();
		t.addition(11.11f,22.22f);
		t.addition(11, 22);
		t.addition(10, 20);
		t.addition();
		addition(30, 11.99f);
		

	}
	
	
	public void addition()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public void addition(float a, float b)
	{
		double sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void addition(long a, long b)
	{
		long sum= a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void addition(int a,float b)
	{
		float sum=a+b;
		System.out.println("Addition is "+sum);
	}

}
