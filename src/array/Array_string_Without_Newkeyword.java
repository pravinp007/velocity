package array;

public class Array_string_Without_Newkeyword {

	public static void main(String[] args) {
		//2 nd type of array method to solve the array program without using new keyword
		
		
		//string array method
		String name[]= {"ram","laxman","seeta"}; //index are in declare in one time
		
		for(int a=0; a<=name.length-1; a++)
		{
			System.out.print(name[a]+"_");
		}
		System.out.println ();       
	
		//char array method
	 char division[]= {'a','b',  'c','d'};
	 
	 for(int p=0; p<=division.length-1; p++)
		{
			System.out.print(division[p]+" ");
		}
	 System.out.println("=======================================");
	
	 //int array method
	 	int a[][] = { { 11, 33 },     { 99, 88 },     { 12, 14 } };

		// using static for loop for non symmetric matrix "3x2"
		for (int x=0; x<=2; x++)
		{
			for (int z=0; z<=1; z++) 
			{
				System.out.print(a[x][z] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==========================================");
		
		
		int b[][] = { { 11, 22, 33 }, { 99, 88, 77 }, { 10, 12, 14 } };
		// using dynamic for loop for symmetric matrix "3x3"
		
		for (int i = 0; i <= b.length - 1; ++i)            //this is dynamic coding with method.length
	    {
			for (int j = 0; j <= b.length - 1; j++) 
			{
				System.out.print(b[i][j] + " ");

			}
		        System.out.println();
		}
	 
		
	}

}
