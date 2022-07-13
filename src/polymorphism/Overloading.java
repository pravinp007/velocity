package polymorphism;

public class Overloading {

	public static void main(String[] args) {

		Overloading o = new Overloading();

		o.add(10, 20);
		o.add(20, 50);
		o.add(10, 20);
		o.add(10, 20, 30);
        add(10,20,30,40);
        
	}
 //once binding is done, again rebinding can't be done, so it is called static binding.
	public  void add(int z,int v)   //two parameter non static method
	{
		int sum = z + v;
		System.out.println("Sum is " + sum);
	}

	public void add(int a, int b, int c)  //three parameter non static method
	{
		int sum = a + b + c;
		System.out.println("Sum is " + sum);
	}
	
	public  static void add(int a, int b, int c,int d) //four parameter non static method
	{
		int sum = a + b + c+ d;
		System.out.println("Sum is " + sum);
	}
	
	private  void add(int a) //one parameter non static method
	{
		int sum = a;
		System.out.println("Sum is " + sum);
	}
}
