package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistbyme {

	public static void main(String[] args) {
		
		ArrayList arl=new ArrayList();
		arl.add("Saswad");
		arl.add('S');
		arl.add(null);
		arl.add(2.123);
		arl.add("Saswad");
		arl.add('S');
		arl.add(null);
		arl.add(2.123);
		
		
		//arl.clear();
		//arl.addAll(arl);\
//		System.out.println(arl.equals(arl));
//		System.out.println(arl.get(2));
//		System.out.println(arl.getClass());
//		System.out.println(arl.hashCode());
//		System.out.println(arl.iterator());
//		System.out.println(arl.lastIndexOf(null));
//		System.out.println(arl.listIterator());
		//System.out.println(arl.parallelStream());
		
		
		System.out.println("=========By using for loop========");
		for(int i=0;i<=arl.size()-1;i++)
		{
			System.out.println(arl.get(i));
		}
		
		System.out.println("=========By using iterator========");
		Iterator it=arl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=========By using Listiterator========");
		ListIterator li=arl.listIterator();
		while(li.hasNext())
			{
				System.out.println(li.next());
			}
				
		System.out.println("=========By using for each loop========");
		for(Object o:arl)
		{
			System.out.println(o);
		}
			
		
		
		//System.out.println(arl.clone());
		

	}

}
