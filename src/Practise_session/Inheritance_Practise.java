package Practise_session;

public class Inheritance_Practise {

public static void main(String[] args) {
	
	method();//static calling in same class 
	Inheritance1.method1();//static calling in different class
	
	Inheritance_Practise g=new Inheritance_Practise();
	g.method2();//Non-static calling in same class 
    Inheritance1 r=new Inheritance1();
    r.method3();//Non-static calling in different class
}	
// static 
// Nonstatic

public static void method() {
	int a=50;
		int sum=a+50;
	System.out.println(sum);}
	
	public void method2() {
		int c=70;
			int sum2=c+50;
		System.out.println(sum2);
}
}

class Inheritance1{
	public static void method1() {
		int b=60;
		int sum=b+50;
	System.out.println(sum);
	}
	public void method3() {
		int d=80;
			int sum3=d+50;
		System.out.println(sum3);
}
}