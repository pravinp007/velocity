package constructor;

public class UserDefinedConstructor {
	int a=10; int b=22;
	  
	public UserDefinedConstructor()    //user defined constructor without parameter
	  
	   { 
		
	  System.out.println("value of a is "+a);
	  System.out.println("value of b is "+b);
	  System.out.println();
	  
	   }
	
	public static void main(String[] args)
	{
		UserDefinedConstructor obj=new UserDefinedConstructor();      //object created
		obj.test();

	}
 public void test()
 {
	 System.out.println("hii i am a test method");
 }
}
