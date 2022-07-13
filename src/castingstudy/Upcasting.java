package castingstudy;

public class Upcasting {

	public static void main(String[] args) 
	{  
		Fathersuperclass f=new Fathersuperclass();
		SonSubclass s=new SonSubclass();
		
		f.bike();
		f.cars();
		s.bike();
		s.cars();
		System.out.println("==========================");
		Fathersuperclass f1=new SonSubclass();   //creating object of subclass means Son and giving super class 
		f1.bike();       // eligible for casting  
		f1.cars();
		 
	}

}
