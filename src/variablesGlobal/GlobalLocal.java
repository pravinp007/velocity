package variablesGlobal;

public class GlobalLocal {
	int a = 10; // non static global variable
	static int b = 20; // static global variable

	public static void main(String[] args) 
	{ 
		GlobalLocal obj =new GlobalLocal();
		method(); // call static method from same class
        
		System.out.println("sum is "+b);       // calling  global static method from same class(variable only)
		System.out.println("sum is "+obj.a);  //calling non static method from same class(object and variable)
		
		Samplenotmethod obj2 =new Samplenotmethod();
		System.out.println("addition is "+obj2.p);
		System.out.println(Samplenotmethod.s);
	}

	public static void method() {
		int sum = b + 39; // call static global variable only
		System.out.println("sum is " + sum);
	}

	public void method1() {
		int sum = a + 10; // call non static method global variable only
		int sub = b - 10;
	}
}
