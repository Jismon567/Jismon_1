package Practise_session;

public class iinterfaccccc implements pp,pk{

	public static void main(String[] args) {
		iinterfaccccc kp=new iinterfaccccc();
kp.c();

	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		System.out.println("go");
		
	}

}
interface pp {
	void b();
	
	static void bn(){
		
	}
	default void bk() {
		System.out.println("hello");
	}
	
}


interface pk{
	void c();
	
	
}
