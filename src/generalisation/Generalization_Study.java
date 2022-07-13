package generalisation;

 public class Generalization_Study {

	 
	public static void main(String[] args) 
	{
		KotakMahindra k=new KotakMahindra();
		AxisBank a=new AxisBank();
		
		System.out.println("=================================");
		k.loan();
		k.account();
		k.credit();
		System.out.println("==================================");
        a.account();
        a.loan();
        a.debit();
        System.out.println("==================================");
	}

}
