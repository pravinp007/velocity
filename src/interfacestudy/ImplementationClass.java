package interfacestudy;

public class ImplementationClass implements Myinterface {
	// The type ImplementationClass must implement the inherited abstract method
	// Myinterface

	public static void main(String[] args) {
		ImplementationClass ic = new ImplementationClass();
		ic.home();
		ic.home1();
		method();        //calling static mathod from same class
	}

	@Override
	public void home() {
		System.out.println("hii i am incomplete method of my interface class & my name is home, " + 
	"now am completed");

	}

	@Override
	public void home1() {
		System.out
				.println("hii i am incomplete method of my interface class & my name is home-1, " +
		"now am completed");

	}
	public static void method()
	{
		System.out.println("i am static method of implementation class");
	}

}
