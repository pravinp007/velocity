package accessSpecifier;

public class PrivateSpecifier {

	public static void main(String[] args) {
		 
		PrivateSpecifier p1=new PrivateSpecifier();
		p1.test1(); //private method
		p1.test2(); // default mehod
		p1.test3(); //protected method
		p1.test4();  //public method
		
		
	}
       private  void test1() {
    	   System.out.println("hii i am private specifier");
       }
       void test2()
       {
    	   System.out.println("hii i am default spcifier");
       }
       protected void test3()
       {
    	   System.out.println("hii i am protected specifier");
       }
       public void test4()
       {
    	   System.out.println("hii iam public specifier");
       }
       
}
