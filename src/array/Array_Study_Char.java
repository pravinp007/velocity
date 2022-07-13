package array;

public class Array_Study_Char {

	public static void main(String[] args) {
		char a[] = new char[5];
		a[0] = 'Q';
		a[1] = 'Q';
		a[2] = 'R';
		a[3] = 'E';
		a[4] = 'W';
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("==By using for loop==");
		for (int i = 0; i <= 4; i++) //this is static coding
		{
			System.out.println(a[i]);
		}
		System.out.println("==length method==");

		for (int i = 0; i <= a.length - 1; i++) //this is dynamic coding
		{
			System.out.println(a[i]);
		}
		System.out.println("==reverse by using loop==");

		for (int i = 4; i >= 0; i--) 
		{  
			System.out.println(a[i]);
		}
		System.out.println("==reverse by using length method==");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}

	}


	}


