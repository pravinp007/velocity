package loopsStudy;

public class Whileloop {

	public static void main(String[] args) {

		// want to print 2 cha paadha. // 2 to 20 means increment

		int a = 2; // initialize the variable
		while (a <= 20) // this is a condition
		{
			System.out.println(a);
			a = a=a+2; // updation
		}
		System.out.println();

		// want 2 cha paadha in reverse

		int b = 20; // initialize the variable
		while (b >= 2) // this is a condition
		{
			System.out.println(b);
			b = b - 2;         
		}
		System.out.println();

		// to print 8 table in reverse
		int c = 72; // initialize the variable
		while (c >= 8) // this is a condition
		{
			System.out.println(c);
			c = c - 8;
		}

	}

}
