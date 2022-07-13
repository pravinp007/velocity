package abstractClass;

public class ConcrateClass extends AbstractStudy {

	public static void main(String[] args) {

		 ConcrateClass.ppt2(); //calling from another cls
		
	ConcrateClass ab=new ConcrateClass();  //created object of concrete class
	ab.po();          //calling non static method from same class
	ab.ppt();         //calling abstract another class
	ab.scene2();      //calling non static method from abstract  class
	ab.scene();
    ConcrateClass.ppt2();   //calling static method from abstract class
		
	}

	@Override
	public void ppt() {
          System.out.println("hii this is abstract classs method");
	}
    public void po() //this is own non static method of concrete class
    {
    	System.out.println("hii this is own  non static method of concrete class");
    }

	@Override
	public void scene() {
		 
		
	}
}
