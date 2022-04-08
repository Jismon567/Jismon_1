package Practise1;

public class Reverseloop3digitno {

	public static void main(String[] args) {
		int n = 356;
		int a = n/100;
		int b = n-a*100;
		int c = b/10;
		int d = b-c*10;
		int e = d*100+c *10+a;
		System.out.println(e);
		logic();
	}
public static void logic() {
	int n = 236541;
	int t;
	int s = 0;
	while(n>0) {
		t=n%10;
		s=s*10+t;
		n=n/10;
	}
	System.out.println(s);
}
}
