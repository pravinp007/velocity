package collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {
		 Vector v=new Vector();
		  v.add("pune");
		  v.add("pune");
		  v.add("pune");
		  v.add('A');
		  v.add(null);
		  v.add(null);
		  v.add(1234);
		  v.add(12.33);
		  v.add(true);
		  v.add(1234);
		  v.add(12.33);
		  
		  System.out.println(v);
		  System.out.println(v.get(3));
		  System.out.println(v.isEmpty());
		  System.out.println(v.capacity());
		  System.out.println(v.contains("pune"));
		  System.out.println(v.hashCode());
		  System.out.println(v.remove(3));
		  System.out.println(v);
	 
		  System.out.println("*********************iterator******************************"); 
		  Iterator it = v.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  System.out.println("**************list_iterator**************************************");
		 
		  ListIterator lit = v.listIterator(); 
		  while(lit.hasNext())
		  {
			  System.out.println(lit.next());
		  }
		  System.out.println("*********************For_Loop**********************************");
	  
		 for(int i=0; i<=v.size()-1; i++)
		 {
			 System.out.println(v.get(i));
		 }
         System.out.println("==============for_each_loop===================");
		 
		 for(Object ap:v)
		 {
			 System.out.println(ap);
		 }
		 System.out.println("==============================================="); 
		  
	}

}
