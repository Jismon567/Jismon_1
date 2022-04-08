package jismon;

public class this_use {

	int a=100;
	static int b=120;
	
	public static void main(String[] args) {
		
		this_use ts=new this_use();
		ts.test1();
		
		
		
		
		/*ts.test2();
        test1();
       System.out.println("Global variable of a in test1"+ts.a);
       System.out.println("Global variable of b in test2"+b);*/
	}

public static void test1()
{
	this_use t=new this_use();
	int a=50;
	int sum=10+a;
	int b=150;
			int sum1=10+b;
			System.out.println("Local variable of test1 "+a);
			System.out.println("Local variable of b" +b);
}

/*public void test2()
{
	int a=12;
	int b=111;
	int sum=10+a;
	int sum1=10+this.a;
	System.out.println("Local variable of test1  "+a);
}*/
}



