package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_study {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("package");
		lh.add("package");
		lh.add("A");
		lh.add(232);
		lh.add(12.98);
		lh.add(true);
		lh.add(null);
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.clone());
		System.out.println(lh.contains(null));
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.remove(null));
		System.out.println(lh);
		 
		System.out.println("****************************For_each Loop*****************************");
		
		 for(Object pp:lh)
		 {
			 System.out.println(pp);
		 }
		 
			System.out.println("***********************Iterator*****************************");
        
			Iterator it= lh.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
