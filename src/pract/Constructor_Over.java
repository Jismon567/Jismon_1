package pract;

public class Constructor_Over {

	public static void main(String[] args) {
	//Constructor_Over nk=new Constructor_Over(1,2,5);
	new Constructor_Over(2,5);
	}

	public Constructor_Over() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public Constructor_Over(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public Constructor_Over(float a, float b) {
		float c=a+b;
		System.out.println(c);
	}
	public Constructor_Over(float a, int b) {
		float c=a+b;
		System.out.println(c);
	}
	public Constructor_Over(int a, int b, int d) {
		int c=a+b+d;
		System.out.println(c);
	}
}

/*class rushi extends Constructor_Over{
	rushi kl=new rushi();
	public rushi() {
		System.out.println("hi");
	}
}*/

