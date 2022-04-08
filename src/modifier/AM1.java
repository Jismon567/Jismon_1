package modifier;

public class AM1 {
	int a=10;//visibility--> default--> within package only
	private int b=20;//visibility-->private-->within class only
	protected int c=30;//visibility-->protected--> within package+inheritance for outside package
	public int d=40;//visibility--> public--> within project 
	public static void main(String[] args)
	{
		AM1 m1= new AM1();// created object m1 of class AM1
		m1.test1();
		m1.test2();
		m1.test3();
		m1.test4();
		System.out.println(m1.d);
		System.out.println(m1.c);
		System.out.println(m1.b);
		System.out.println(m1.a);

	}
	
	public void test1()
	{
		System.out.println("visibility--> public--> within project test1 method of AM1 class");
	}
	
	protected void test2()
	{
		System.out.println("visibility-->protected--> within package+inheritance for outside package test2 method of AM1 class");
	}

	private void test3()
	{
		System.out.println("visibility-->private-->within class only test3 method of of AM1 class");
	}
	
	void test4()
	{
		System.out.println("visibility--> default--> within package only test4 method of AM1 Class");
	}
}


