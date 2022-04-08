package Array_Pract;

public class String_12 {
	public static void main(String[] args) {

		// without using new keyword
		// String objname="value";---> constant pool area
		// with using new keyword
		// String objname= new String("value")---> non-constant pool area

		String s = "Velocity";
		String m = "Velocity";
		String a = "Velocity";
		String m2 = new String("VELOCITY ");
		String a1 = new String("Velocity Corporate");
		String s1 = new String("Corporate");
		String m1 = new String("Corporate");
		String m3 = new String("Training");
		String m4 = new String("Center");
		String b = "";
		String b1 = " ";

		System.out.println(m2.concat(m1).concat(m3).concat(m4));

//		System.out.println(a1.substring(15));
//		String substring = a1.substring(15);
//		System.out.println(substring);
//		System.out.println(a1.substring(4, 12));
//		System.out.println(m1.endsWith("Cporate"));
//		System.out.println(m1.startsWith("orp", 1));

//		System.out.println(s.charAt(2));
//		System.out.println(s.charAt(-1));

//		System.out.println(b.isEmpty());
//		System.out.println(b1.isEmpty());
//		System.out.println(b1.isBlank());
//		System.out.println(b.isBlank());
		// System.out.println(s1.isEmpty());

//	/	System.out.println(m1.contains("Cor"));

		System.out.println(m2.equals(a1));
//		System.out.println(m2.equalsIgnoreCase(a1));

//		System.out.println(a.equals(m));
//		System.out.println(a.equals(a1));
//		System.out.println(s==a1);

//		System.out.println(s1.equals(m1));
//		boolean result = s1.equals(m1);
//		System.out.println("Result is "+result);
//		
//		System.out.println(s.equals(m));
//		System.out.println("Memory comparing is "+(s==m));
//			
//		System.out.println("Memory comparing is "+(s1==m1));

		char result = m1.charAt(2);
		System.out.println("char at 2 is " + result);

		int index = m1.indexOf('e');
		System.out.println("index of e is " + index);

		String test = "weeek";
		System.out.println(test.indexOf('e'));
		System.out.println(test.lastIndexOf('e'));
		String test1 = test.replace('e', 'd');
		System.out.println(test1);
		System.out.println(test.replace("we", "mi"));

		String p = "Are,You,There";
		String q = "India is my Country";
		String o = "I_love_my_India";

		String z = " ";
		System.out.println(z.isBlank());
		System.out.println(z.isEmpty());

	//	String x = null;
		//System.out.println(x.isBlank());
		//System.out.println(x.isEmpty());

//		System.out.println(s.length());
//		int lengthOfS = s.length();
//		System.out.println("Length of s is "+lengthOfS);
//		System.out.println(s1.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s1.toUpperCase());
//		String UppercaseofS1 = s1.toUpperCase();
//		System.out.println("Upper case of s1 "+UppercaseofS1);
//		String lowercaseofs1=UppercaseofS1.toLowerCase();
//		System.out.println("Lower case of s1 "+lowercaseofs1);
}}
