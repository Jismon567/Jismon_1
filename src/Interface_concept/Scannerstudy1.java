package Interface_concept;

import java.util.Scanner;

public class Scannerstudy1 {

	public static void main(String[] args) {
	
		Scannerstudy1 it=new Scannerstudy1();
		it.add();
		// add();
	}
	/*public static void add() { 						 //        static method scanner used
		int a;											//OUTPUT:- Enter your first num
		int b;											//            23
		int c;											 //          Enter your second num 
		Scanner s=new Scanner(System.in);				 //             25			  
		System.out.println("Enter your first num ");    //           your add is 48
		a =s.nextInt();
		System.out.println("Enter your second num ");
		b =s.nextInt();
		s.close();
		
		c=a+b;
		System.out.println("your add is "+ c);
	}*/
	public void add() {
		int a;										  //        Nonstatic method scanner used
		int b;                                        //OUTPUT:- Enter your first num 
		int c;                                        //            23
		Scanner s=new Scanner(System.in);             //          Enter your second num 
		System.out.println("Enter your first num ");  //             25
		a =s.nextInt();                               //           your add is 48
		System.out.println("Enter your second num ");		
		b =s.nextInt();
		s.close();
		
		c=a+b;
		System.out.println("your add is "+ c);
}}
