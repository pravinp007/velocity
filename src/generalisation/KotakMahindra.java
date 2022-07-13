package generalisation;

public class KotakMahindra implements RBI {

	@Override
	public void loan() 
	{
		System.out.println("loan interest is 6%"); 
		
	}

	@Override
	public void account() 
	{
		System.out.println("account  interest is 9%");  
		
	}
	public void credit()
	{
		System.out.println("credit interest is 4%");
	}

}
