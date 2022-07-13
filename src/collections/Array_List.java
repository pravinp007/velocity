package collections;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// arraylist
		ArrayList al = new ArrayList();
		al.add("NashikPune");
		al.add(null);
		al.add("graduation");
		al.add(null);
		al.add("graduation");
		al.add("postgraduation");
		al.add('A');
		al.add(23);
		al.add(true);
		al.add(83.80);
		al.add(1245637896l);
		
		System.out.println(al);
		// output-[NashikPune, null, graduation, null, graduation, postgraduation, A, 23, true, 83.8, 12456378965]

		// to find size
		System.out.println(al.size());// 11

		System.out.println(al.isEmpty());// false

		System.out.println(al.contains("NashikPune"));// true
		System.out.println(al.contains("velocity"));// false

		System.out.println(al.get(4)); // graduation

		System.out.println(al.indexOf("graduation"));// 2

		System.out.println(al.remove(3));// null

		al.add(0, "university");
		System.out.println(al);
// [university, Nashik- Pune university, null, graduation, graduation, postgraduation, A, 23, true, 83.8, 12456378965]
		System.out.println("===============================================================");
		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}


	}

}
