package Sec;

import modifier.AM1;

public class jis extends AM1
{

public static void main(String[] args) {
	AM1 m1=new AM1();
			m1.test1();
			System.out.println(m1.d);
	
			jis s1=new jis();
			System.out.println(s1.c);
			s1.test1();
			s1.test2();
			System.out.println(s1.d);
	
	char   grade;
	grade='C' ;
	System.out.println ("Your grade is   "+grade);
	
	
	int rollnumber;
	rollnumber=1;
	System.out.println(rollnumber);}

	public static void method2()
	{System.out.println("This is method2 running");


	}


}

