package Interface_concept;

import java.util.Scanner;

public class Scanner_study {

	public static void main(String[] args) {
		
		Scanner t=new Scanner(System.in);
		System.out.println("Please enter your input");
		 String datatype = t.nextLine(); //nextline is to allow user to write info in next line
		// int details =t.nextInt();
		 System.out.println("You have answered "+ datatype);
//System.out.println("Your input is " +details);
	}

}


/* OUTPUT- [  Please enter your input
               233
              You have answered 233*/