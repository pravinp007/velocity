package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_Study {

	public static void main(String[] args) {
		 LinkedList ll=new LinkedList();
		 ll.add("nashik");
		 ll.add("A");
		 ll.add("nashik");
		 ll.add(null);
		 ll.add(null);
		 ll.add(1234);
		 ll.add(12.34f);
		 ll.add(true);
		 
		 
		 System.out.println(ll);
		 System.out.println(ll.isEmpty());
		 ll.add(2,200);      //2 is index number 
		 System.out.println(ll);
		 System.out.println(ll.contains(ll));
		 System.out.println(ll.peek()); //it will retrieve but does not remove first element or head
		 System.out.println(ll);
		 System.out.println(ll.pop()); //it will remove the head or first element
		 System.out.println(ll);
		 System.out.println(ll.lastIndexOf(1234));
		 
		 
		 System.out.println("******************for loop**********************");
		 
		 for(int i=0; i<=ll.size()-1; i++)
		 {
			 System.out.println(ll.get(i));
		 }
		 
		 System.out.println("******************iterator**********************");
		 
		 Iterator it= ll.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("******************List iterator**********************");
	     
		 ListIterator list=ll.listIterator();
		 while(list.hasNext())
		 {
			 System.out.println(list.next());
		 }
	
		 System.out.println("******************for each Loop**********************");
		 
		 for(Object ap:ll)
		 {
			 System.out.println(ap);
		 }
	}
	

}
