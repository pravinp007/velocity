package thisAndsuperkeyword;

public class Thiskeyword {

	int a = 200;     //global variable non static 
    static int c=400;  //static global variable
	public static void main(String[] args) {

		Thiskeyword ap = new Thiskeyword();   //non static method calling
		ap.add();
		
		add1();

	}

	public void add() {
		int a = 20;       //initialize
		int sum = a + 30;        //local variable 
		System.out.println(sum);

		int sum1 = this.a + 14;         //global variable call from this keyword
		System.out.println(sum1);
		
		int sum2 =this.a+40;           //global variable call from this keyword
		System.out.println(sum2);
		
	}	
		public static void add1()
		{   int n=30;
			int sum3=c+1;
			System.out.println(sum3);
			System.out.println();
			
			int sub4= c;           // we use this keyword only at the time of non static method
			System.out.println(sub4);
	}
}