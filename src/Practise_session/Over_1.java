package Practise_session;

public interface Over_1 {
	
	//Over_1 mk=new Over_1() {
	ppp n=new ppp() {
	public static void main(String[] args){
		n.m7();
		//mk.m6();
		//mk.m6();
	  
		//Over_1 mk=new Over_1() {
		/*ppp n=new ppp()
		{

			@Override
			public void m6() {
				// TODO Auto-generated method stub
				System.out.println("hiiii jismon");
			}

			@Override
			public void m7() {
				// TODO Auto-generated method stub
				System.out.println("i am rock");
			}
			
		}; 		 
		
n.m6();
	n.m7();			
			}*/
  	}

	@Override
	public void m6() {
		System.out.println("hello");	
		System.out.println('h');
	}

	@Override
	public void m7() {
		System.out.println("hello");	
		System.out.println('h');
		
	}
	
	};

	void m6();
}

/*	public static void m6() {
		// TODO Auto-generated method stub
		
	
}}*/

interface ppp extends Over_1{
	void m7() ;
}
