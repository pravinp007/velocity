package castingstudy;

public class Primitive_Casting {

	public static void main(String[] args) 
	{
		 //it converting one data type information to another data type is called primitive casting.
		/*types- 1} implicit---->  converting lower data type info to  higher data type
		 2} explicit -----> converting higher data type info to  lower data type
		 3} boolean--------> it is in compatible casting type
		 */
		
		int c=20;              //lower data type info
		System.out.println(c);
		
		double d=c;          // convert into higher data type info. is called implicit casting
		System.out.println(d);
		
		
		double z=987.76;
		System.out.println(z);   //higher data type info.
		                                                 
		int v=(int)z;            //lower data type info.
		System.out.println(v);
	}

}
