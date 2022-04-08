package Practise_session;

public class Sons_class extends father1{

	public static void main(String[] args) {
		
		/*father1 f=new father1();
		f.money();*/
		
		/*Sons_class s=new Sons_class();
		s.money();*/
		
		father1 f2=new Sons_class();
		f2.money();
		f2.bike();
		f2.care();
		mk();
	}

	public void money()
	{
	System.out.println("Son have money");
}
	void care() {
		System.out.println("son has care");	
	}
		void love() {
		System.out.println("father has love");
}}
