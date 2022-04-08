package pract;

public class Even_oddAdd {

	public static void main(String[] args) {
		
		int num=0;
		for(int i=1;i<=20;i++) {
			
		    if(i%2==0) {
		    	num=num+i;
			/*  System.out.println("Even");
			  System.out.println(2*(i-1));
			  System.out.println(i+i);*/
			  
		    }
		  /* else {
		    System.out.println("Odd");
		    System.out.println(i);
		   }*/
		   
		}
		
		System.out.println("The Sum of Even Numbers upto " + 20 + "  =  " + num);
	}

}
