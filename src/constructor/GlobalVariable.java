package constructor;

public class GlobalVariable {

	int a=10;  //non static global variable
	 static int b=20; //static global variable
	
	
	public static void main(String[] args)
	{
	 GlobalVariable obj=new GlobalVariable();
	 obj.test();                //calling non static method
	 
  
	  test1();                    //calling  static method
	}
  public void test()
  {
	  int sum=a+10;  //both methods are accepted in non static class
	  int sub=b-20;
	  System.out.println("my sum is "+sum);
	  System.out.println("my sub is "+sub);
  }
  public static void test1()
  {
	  int sub=b-9;  //its accept only static method
	  System.out.println("my static sub is "+sub);
  }
}
