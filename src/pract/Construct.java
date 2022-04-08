package pract;

public class Construct {

	public Construct() {
		int a=12;
		System.out.println("hi  " + a);
	}
	
	public Construct(int a) {
		int b=15;
		int sum= b+a;
		int sum1=a+b+a;
		int sum2=a*b;
		System.out.println(sum + sum1);
		System.out.println(sum2);
	}
	
	private Construct(float a) {
		int g=12;
		System.out.println(a+g);
	}
	
	public static void main(String[] args) {
		new Construct();
		new Construct(2);
		new Construct(1.2f);

	}

}
