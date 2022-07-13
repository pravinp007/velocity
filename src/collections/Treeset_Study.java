package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Study {

	public static void main(String[] args) {
		 TreeSet tr= new TreeSet();
		 tr.add("chalisgaon");
		 tr.add("pune");
		 tr.add("pune");
		 tr.add("malegaon");
		 tr.add("mumbai");
		 tr.add("satana");
		 tr.add("pachora");
		 tr.add("nashik");
		 
		 System.out.println(tr);
         System.out.println(tr.size());
         System.out.println(tr.isEmpty());
         System.out.println(tr.last());
         System.out.println(tr.floor("nashik"));
         
         
         System.out.println("********************Iterator************************");
         
         
         Iterator it=tr.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         System.out.println("********************For_each Loop************************");
       
         for(Object ap:tr)
         {
        	 System.out.println(ap);
         }
	}
	
	
	
	

}
