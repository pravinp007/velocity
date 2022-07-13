package array;

public class Multidimensional_array {

	public static void main(String[] args) {
		 int a[][] = new int [2] [2];         //declaration  //with using new keyword
		                            
		 a[0][0]=1;         //initialiazation
		 a[0][1]=2;                 
		 a[1][0]=3;                 
		 a[1][1]=4;
		                            
		 System.out.print(a[0][0]+" ");
		 System.out.println(a[0][1]);
		 System.out.print(a[1][1]+" ");
		 System.out.println(a[1][0]);
		 
		for(int i=0; i<=a.length-1; i++) //i=0,1,2   //it is for row  i=0, i=0 <=1 i++   ,i=1  i=1< =1 
		{
			for(int j=0; j<=a.length-1; j++)  //j=0,1,2  
			{
				System.out.print(a[i][j]+" ");
			}
	            System.out.println();
		}
		
		
		 
		 
	}

}
