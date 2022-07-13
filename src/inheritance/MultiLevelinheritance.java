package inheritance;

public class MultiLevelinheritance {

	public static void main(String[] args) {

		GrandMother g = new GrandMother();
		g.receipe();
		g.stories();
		System.out.println("#########################");
		Mother m = new Mother();
		m.care();
		m.receipe();
		System.out.println("###############################");
		Child c = new Child();
		c.lappy();
		c.care();
		c.receipe();

//	 GrandMother g=new GrandMother();
//	 g.receipe();          // calling own non static property
//	 
//	 Mother m=new Mother();
//	 m.receipe();           //calling grandmother non static method using sub cls object i.e, mothers object
//	
	 m.nature();       //calling own non static method
//	 
//	 Child c=new Child();
//	 c.mobile();    //calling own non static property
//	 c.nature();      //calling non static method of mother
	 c.receipe(); //calling non static method of supermost cls i.e,grandmother
//	 
//	 GrandMother.stories();    //calling own static method
//	 
//	 Mother.care();            //calling own static method
//	 Mother.stories();          // calling static method of superclass 
//	 
//	 Child.lappy();
//	 Child.care();
//	 Child.stories();
//	 
//	 

	}

}
