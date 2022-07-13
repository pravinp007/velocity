package loopsStudy;

public class ForLoop {

	public static void main(String[] args) {
	
		//i want to print 1 number for 5 times.      //1 to 5 means increment
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(); 
		
	//i want to print 1 number for 10 times.      //10 to 1 means decrement reverse(oolta) 
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println();
		
	// want to type velocity for 10 times.
		String name="velocity";
		for(int i=1;i<=10;i++)                        //increment 
		{
			System.out.println(name);
		}
		System.out.println();
		
		//i want to print 3 table.          // 3 to30 means increment
		for(int i=3;i<=30;i=i+3)
		{
			System.out.println(i);
		}
		System.out.println();
	
	
	        //want to type type 4 table in reverse
           for (int a=40;a>=4;a=a-4)                     //40 to 4 means decrement reverse
           {
        	   System.out.println(a);
           }
           System.out.println();
           
           
           int sum=0;
           for (int i=1; i<=10; i++)
        	   
        	   sum=sum+i;
           {
        	   System.out.println(sum);
           }
	
}
}