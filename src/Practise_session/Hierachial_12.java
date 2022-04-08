package Practise_session;

public class Hierachial_12 {

	public static void main(String[] args) {
		child1 rg=new child1();
		rg.R2();
		child2 rt=new child2();
rt.R2();
	}
 public void R2() {
	 System.out.println("Hi");
 }
}

class child1 extends Hierachial_12{
	
	 public void R3() {
		 System.out.println("Hello");
	 }
}


class child2 extends Hierachial_12{
	public void R4() {
		 System.out.println("Bye");
	 }
}

