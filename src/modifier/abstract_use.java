package modifier;

public class abstract_use extends abstract1{
int a=100;
	public static void main(String[] args) {
		abstract_use c=new abstract_use();
		c.a();
		c.B();
		c.C();
	}
	void a() {
		System.out.println("HI");
	
		int a=50;
		System.out.println("hi"+this.a);
		System.out.println("hiii"+super.a);
					
	}}
	
abstract class abstract1 {
	int a=80;
	abstract void a();
	public void B() {
		System.out.println("hello");
	}
		public void C() {
			System.out.println("hello C");
			
	}
}
		
		
	

	

