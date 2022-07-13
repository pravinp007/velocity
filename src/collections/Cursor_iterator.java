package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor_iterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("velocity");
		al.add("velocity");
		al.add('A');
		al.add(null);
		al.add(null);
		al.add(1234);
		al.add(12.32);
	    al.add(true);
		 
		 
		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(al.clone());
		 System.out.println(al.get(6));
		 System.out.println(al.isEmpty());
		System.out.println("===========for loop================="); 
		 
		 for(int i=0; i<=al.size()-1; i++)
		 {
			 System.out.println(al.get(i));
		 }
		 
		 System.out.println("=======iterator===================");
		 
		 Iterator it = al.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("=======List_iterator===================");
		 
		 ListIterator lit = al.listIterator();
		 while(lit.hasNext())
		 {
			 System.out.println(lit.next());
		 }
		  
		 System.out.println("==============for_each_loop===================");
		 
		 for(Object ap:al)
		 {
			 System.out.println(ap);
		 }
		 System.out.println("==============================================="); 
        }
}



