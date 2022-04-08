package Sec;

public class Overloading_1 {

	
	int num1;
	int num2;
	int num3;
	
	
	
	public Overloading_1() {
		int num1=10;
		int num2=20;
		int num3=30;
		
	}
	
	public Overloading_1(int a) {
		int num1;
		num1=a;
	}
	public Overloading_1(int a, int b) {
		int num1,num2;
		num1=a;
		num2=b;
		
	}
   public Overloading_1(int a, int b, int c) {
	   int num1,num2,num3;
		num1=a;
		num2=b;
		num3=c;
		
	}
		
		
		
	public static void main(String[] args) {
		Overloading1 m1=new Overloading1();
		
		// TODO Auto-generated method stub

	}
	
	public static void add() {
		
	}

}
