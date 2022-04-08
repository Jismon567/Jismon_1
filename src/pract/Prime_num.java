package pract;

public class Prime_num {

	public static void main(String[] args) {
		
		int i,j,counter = 0;
		for(i=1;i<100;i++) {
		counter=0;
		for(j=i;j>0;j--) {
			if (i%j==0) {
			counter=counter+1;
			}	
		}
		
	if (counter==2) {
		System.out.println(i);
	}}

	}}
