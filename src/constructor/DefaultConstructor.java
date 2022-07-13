package constructor;

public class DefaultConstructor {
	int a = 10;
	int b = 20;

	public DefaultConstructor(int x, int y) // Default constructor
	{
		a = x;
		b = y;
		System.out.println("hii i am constructor");
	}

	public static void main(String[] args) {

		DefaultConstructor obj = new DefaultConstructor(11, 23); // created object
		obj.pravin();

	}

	public void pravin()

	{
		int add = a + b;
		System.out.println("addition is " + add);
	}
}
