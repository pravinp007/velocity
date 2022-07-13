    package constructor;

public class CC1 {
	 int a=12;         //variable initialize
	 int b=12;         //variable initialize
	 int c=20;         //variable initialize
	 
	  public CC1()     //user defined zero parameter constructor
	   {
		   	
	   
	   }
	  public CC1(int x)     //1 parameter constructor
	{ 
	a=x;
	}
	  public CC1(int x,int y) //2 parameter constructor
	  {
		  a=x;
		  b=y;
	  }
	  public  CC1 (int x,int y,int z)    //3 parameter constructor
	  {
		  a=x;
		  b=y;
		  c=z;
	  }
	public static void main(String[] args) {
		CC1 obj=new CC1(10,2,40);
		obj.add(); 
		}
 public void add() 
 {
	 int sum1 =a+b+c;
	 System.out.println("Addition is "+sum1);
 }
 
}
