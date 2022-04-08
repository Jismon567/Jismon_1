package javaproject;

public class Group {

	public static void main(String[] args) {
		
		student_info("Sam",201,'B',85);
		student_info("Ram",202,'A',95);
		student_info("Sham",203,'B',81);
		student_info("Lalit",204,'C',75);

	}
public static void student_info(String Name, int Roll_number, char Grade, int Marks)
{
	System.out.println("Student name   :-"+Name);
	System.out.println("Roll number    :-"+Roll_number);
	System.out.println("Grade:-        "+Grade);
	System.out.println("Marks          :-"+Marks);
}
}
