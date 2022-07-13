package controlstatement;

public class Nestedifstudy {

	public static void main(String[] args) {
		// if username is correct then please enter passwd
		// if passwd correct --> u r login
		// else-->enter correct passwd
		// if enter correct username
		String username = "pravin";
		String passwd = "1234";

		if (username == "pravin") 
		{
			if (passwd == "1234") 
			{
			System.out.println("u r login");
			} 
			else 
			{
			System.out.println("enter correct passwd");
			}
		} 
		   else 
		{
			System.out.println("enter correct username");
		}
	}

}
