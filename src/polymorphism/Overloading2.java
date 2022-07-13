package polymorphism;

public class Overloading2
//banking domain: overloading2

//create in both manner static and non-static
//3-method cashwithdrawal 
//a-name,b-types atm
//b-name,amount,branch
//c-pin, grade ,day,acctype
//then overload
{

	public void cashwithdraw(String name, String atm) 
	{
        System.out.println(name);
		System.out.println(atm);
	}

	public void cashwithdraw(String name, int amount, String branch) {
		System.out.println(name);
		System.out.println(amount);
		System.out.println(branch);
	}

	public void cashwithdraw(int pin,char grade,String day,String acctype)
 {
	 System.out.println(pin);
	 System.out.println(grade);
	 System.out.println(day);
	 System.out.println(acctype);
 }
	public static void cashwithdraw(int number) {

		System.out.println("number is "+number);
	}

	public static void main(String[] args) {

		Overloading2 ov = new Overloading2();
		ov.cashwithdraw("kotakbank", "atm");
		ov.cashwithdraw("nsk", 100000, "malegaon");
		ov.cashwithdraw(422008, 'A', "sunday", "saving");

		cashwithdraw(50000000);
	}
}
