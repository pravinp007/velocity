package generalisation;

public class AxisBank implements RBI
{

	@Override
	public void loan() {
		 
		System.out.println("loan interest is 10%"); 
	}

	@Override
	public void account() 
	{
		System.out.println("account interest is 16%"); 
		
	}
	public void debit()
	{
		System.out.println("debit interest is 4.8%");
	}
	
}
