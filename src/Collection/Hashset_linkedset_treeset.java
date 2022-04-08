package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset_linkedset_treeset {
	public static void main(String[] args) {
		System.out.println("**********=======HashSet======**********");
		HashSet hs= new HashSet<>();
		
		hs.add("Pune");
		hs.add("Velocity");
		hs.add("test");
		hs.add("test");
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println("**********=========LinkedHashSet===========**********");
LinkedHashSet lh= new LinkedHashSet<>();
		
		lh.add("Test");
		lh.add("Test");
		lh.add(null);
		lh.add(null);
		lh.add(12);
		lh.add(23);
		
		System.out.println(lh);
		System.out.println("**********===============TreeSet================**********");
TreeSet t= new TreeSet<>();
		
		t.add(123);
		t.add(456);
		t.add(13);
		
		
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.err.println(t.pollLast());
		System.out.println(t);
		System.err.println(t.pollFirst());
		System.out.println(t);
		System.err.println(t.pollFirst());
	
		
		

	}
}
