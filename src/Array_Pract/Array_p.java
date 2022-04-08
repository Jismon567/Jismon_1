package Array_Pract;

public class Array_p {

	public static void main(String[] args) {
		
			
			int a=10;
			
			String sub1="Math";
			String sub2="Phy";
			String sub3="Chem";
			
			int rollNo=1;
			
			char grade='A';
			
			
			//Velocity Corporate Training Center  Katraj Pune 
			
			String name[]= new String[5];// 1. declaration
			
			name[0]="Velocity"; //2. initialization
			name[1]="Corporate";
			name[2]="Training";
			name[3]="Center";
			name[4]="Katraj";
			//name[5]="Pune";
			
			//3. usage
			
			//System.out.println(name[9]);
			
//			for(int i=0;i<=4;i++)
//			{
//				System.out.println(name[i]);
//			}
			
			for(int i=0;i<=name.length-1;i++)
			{
				System.out.println(name[i]);
			}
			
			
			int RollNum[]= new int[3];
			
			RollNum[0]=1;
			RollNum[1]=2;
			RollNum[2]=3;
		//	RollNum[3]=4;
			
			for(int i=0;i<=RollNum.length-1;i++)
			{
				System.out.println("Roll numbers are "+RollNum[i]);
			}
			

	}

}
