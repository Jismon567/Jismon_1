package String;

public class String1 {
public static void main(String[] args) {
		
		// without using new keyword
		// String objname="value";---> constant pool area
		// with using new keyword
		// String objname= new String("value")---> non-constant pool area
		System.out.println(1234567891);
		String s="Velocity";
		String s1= new String ("Corporate");
		String s2="velocity";
		String s3="Velocity";
		
		
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.contains(s2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(s3));
		System.out.println(s.concat(s));
		
s.length();
}}
