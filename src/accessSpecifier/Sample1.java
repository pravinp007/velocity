package accessSpecifier;

public class Sample1 {

	public static void main(String[] args) {
		 
		
		PrivateSpecifier p=new PrivateSpecifier();
		//p.test1();  //this is private method dont call from another class
		p.test2();      //this is default method from another class
		p.test3();      //this is protected method from another class
		p.test4();      //this is public method from another class

	}

}
