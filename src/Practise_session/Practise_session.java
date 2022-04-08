package Practise_session;

public class Practise_session {
	
	public static void main(String[] args) {
		m1(); //static method calling same class -"methodname"
		P1.m2();//static method calling different class -"classname.methodname"
		
		Practise_session object=new Practise_session(); //classname object=new(keyword) classname
		object.m3();//non-static method calling same class -"objectname.methodname"
		
	    P1 Ranjeet=new P1();
	    Ranjeet.m4();//non-static method calling different class -"objectname.methodname"
	
		
		
int a=10;
	}
	
	//static    
	//nonstatic
	
public static void m1() {
	System.out.println("hi");
}
public void m3() {
	System.out.println("hello");
	
	
}}

class P1{
	public static void m2() {
		System.out.println("hel");
	}
	public void m4() {
		System.out.println("cello");
}}