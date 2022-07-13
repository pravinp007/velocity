package Strings;

public class String_study {

	public static void main(String[] args) 
	{
		//Length Study 
		String Root="length";
		System.out.println(Root.length());  //length=Max.index+1 i.e, 5+1=6 //max index=length-1 i.e; 6-1=5.
       // it returns the length of string in int.
		int lngth = Root.length();
//		System.out.println(lngth);
		
		System.out.println("================================================");
		
		//toUpperCase Study
		String fruit="toUpperCase";
		System.out.println(fruit.toUpperCase());
		//Converts all of the characters in this String to uppercase                                             
		String fruit1 = fruit.toUpperCase();
		System.out.println(fruit1);
		
		System.out.println("======================================");
		
		// toLowerCase Study	
		String flower="toLowerCase";
		System.out.println(flower.toLowerCase());
		//Converts all of the characters in this String to lowercase 
		String flower1 = flower.toLowerCase();
		System.out.println("======================================");
		
		//equals Study
	String animal= "equals";
	String animal1="equals";
	String animal2=new String("Equals");
	String animal3=new String("Equals");
     //Compares this string to the specified object. 
	//The result is true if and only if the argument is not null 
	//and is a String object that represents the same sequence of characters as this object. 
	
	System.out.println(animal.equals(animal1));  //true
	System.out.println(animal1.equals(animal2));  //false
	System.out.println(animal3.equals(animal));   //false
	System.out.println(animal3.equals(animal2));  // true
	
	boolean fox = animal.equals(animal1);
	System.out.println(fox);
	
	boolean fox1 = animal1.equals(animal2);
	System.out.println(fox1);
	System.out.println("==================================");
	
	//equalsIgnoreCase Study
	//Compares this String to another String, ignoring caseconsiderations.
	String run="ignore";
	String run1=new String("Ignore");
	System.out.println(run.equalsIgnoreCase(run1));
	System.out.println(run1.equalsIgnoreCase(run));
	
	System.out.println("=======================================");
	//contains Study
	//Returns true if and only if this string contains the specified sequence of char values
	String user="Eclipse";
	System.out.println(user.contains("ec")); //false
	System.out.println(user.contains("pse"));  //true
	
	 boolean user1 = user.contains("lip");
	 System.out.println(user1);       //true
	 
	System.out.println("========================================="); 
	 //is Empty Study
	 String bird="isEmpty";
	 String bird1="";         //this length is zero
	 String bird2=" ";
	 System.out.println(bird.isEmpty());
	 System.out.println(bird1.isEmpty());
	 System.out.println(bird2.isEmpty());
	 //Returns true if, and only if, length() is 0.
	 boolean anoo = bird.isEmpty();
	 System.out.println(anoo);
		
	 System.out.println("============================================");
	 
	 //isBlank Study
	 String watch="isblank";
	 String watch1="";         
	 String watch2=" ";
	 System.out.println(watch.isBlank());
	 System.out.println(watch1.isBlank());
	 System.out.println(watch2.isBlank());
	// Returns true if the string is empty or contains only white space codepoints,otherwise false.
	 
	 boolean obj = watch.isBlank();
	System.out.println("================================================"); 
	 
	//CharAt Study
	
	String issue="charat";
	System.out.println(issue.charAt(3));
	System.out.println(issue.charAt(5));
	 
		char right = issue.charAt(4);
		System.out.println(right);
		System.out.println("======================================");
		
		//ends with study
		
		String end="endwithstd";
		System.out.println(end.endsWith("td"));
		System.out.println(end.endsWith("th"));
		//Tests if this string ends with the specified suffix
		
		boolean tyh = end.endsWith("std");
		System.out.println(tyh);
		
		
		//Startswith study
		String start="startswith";
		System.out.println(start.startsWith("rts"));         //false
		System.out.println(start.startsWith("th"));
		//Tests if this string starts with the specified prefix.
		System.out.println("==============================================");
		
		
		//Sub String use
		String use="substring study";
		
		System.out.println(use.substring(5));
		
		//Thesubstring begins with the character at the specified index andextends to the end of this string. 
		String use1 = use.substring(7);
		System.out.println(use1);
		
		System.out.println(use.substring(2, 15)); // endindex=max.index + 1 (becoz end index=max.index -1) 
		// 15=endindex.
		//Thesubstring begins at the specified beginIndex andextends to the character at index endIndex - 1.
		//Thus the length of the substring is endIndex-beginIndex. 
		
		 System.out.println("================================================");
		
		//Concat study use
		 
		 String cat="black";
		 String cat1="white";
		 System.out.println(cat.concat("white1"));  //it is use for to combined two strings
		 System.out.println("############################################");
		
		//indexoff study use
		 String country="India";
		System.out.println(country.indexOf('d')); //it show index of character
		
		 System.out.println(country.indexOf('a'));
		 System.out.println(country.indexOf('a', 4)); 
		 
		 System.out.println("==================================");
		 
		 //lastindex of Study use
		 //Returns the index within this string of the last occurrence ofthe specified character. 
		 
		 String of="last index of";
		 System.out.println(of.lastIndexOf('n'));
		 System.out.println(of.lastIndexOf('f'));
		 
		 
		 //replace
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
