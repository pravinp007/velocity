package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_study {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("nashik");
		hs.add("nashik");
		hs.add("nashik");
		hs.add(1243);
		hs.add(143.4f);
		hs.add(true);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.contains(hs));
		System.out.println(hs.equals(hs));
		System.out.println(hs.isEmpty());
		
		System.out.println("****************iterator*********************");
    
		 Iterator it= hs.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 System.out.println("*****************for each loop*********************");
		 
		 for(Object ap:hs)
		 {
			 System.out.println(ap);
		 }
			 
			 
	}

}
