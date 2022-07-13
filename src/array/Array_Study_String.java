package array;

public class Array_Study_String {

	public static void main(String[] args) {
          //1st type object method to solve the array program
		String name[] = new String[5]; // this is String example
		name[0] = "pravin";
		name[1] = "dilip";
		name[2] = "sanket";
		name[3] = "prashant";
		name[4] = "abhijit";
		System.out.println(name[1]);

		for (int i = 0; i <= 4; i++) //this is static coding, because it is fixed 
		{
			System.out.println(name[i]);

		}
		System.out.println("========================");
		for(int a=0; a<=name.length-1; a++)      //index =length-1 ,5-1=4. //it is dynamic coding
		{
			System.out.println(name[a]);
		}

	}

}