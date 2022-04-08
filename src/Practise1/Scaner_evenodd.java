package Practise1;

import java.util.Scanner;

public class Scaner_evenodd {

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter ur first number");
		Scanner k=new Scanner(System.in);
		n=k.nextInt();
		if(n%2==0) {
			System.out.println("Number is even");
			}
		else {
			System.out.println("Number is odd");
	}
	}
}
