package thisAndsuperkeyword;

public class Superkeyword extends Thiskeyword {

	int b = 60;

	public static void main(String[] args) {
       
		Superkeyword su=new Superkeyword();
		su.sub();
		su.add();
		Superkeyword.add1();
		
	}

	public void sub() {
		int b = 40;
		int sub = b - 20;
		System.out.println(sub);
		
		int sub1=super.a+20;           //calling global variable from superclass i.e, Thiskeyword class
		System.out.println(sub1);
		 
		
	}
}