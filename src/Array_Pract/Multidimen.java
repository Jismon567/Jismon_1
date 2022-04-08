package Array_Pract;

public class Multidimen {
	public static void main(String[] args) {

		// 1.array declaration
		char ar[][] = new char[2][2];

		// 2.array initialization
		ar[0][0] = 'a';
		ar[0][1] = 'b';
		ar[1][0] = 'c';
		ar[1][1] = 'd';

		// 3. usage
		for (int i = 0; i <= ar.length - 1; i++)// outer-->row 0-->1-->2
		{
			for (int j = 0; j <= ar.length - 1; j++)// inner-->column 0-->1-->2
			{
				System.out.print(ar[i][j] + " ");
			}

			System.out.println();

		}

	}

}
