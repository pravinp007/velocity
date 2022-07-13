package array;

public class ArrayStudy_Char {

	public static void main(String[] args) {
		 char grade[] =new char[4];
		 grade[0]='a';
		 grade[1]='b';
		 grade[2]='c';
		 grade[3]='d';
		 System.out.println(grade[0]);
		 System.out.println(grade[1]);
		 System.out.println(grade[2]);
		 System.out.println(grade[3]);
System.out.println("========by using for loops================");

 for(int i=0; i<=3; i++)      //by using for loops and it is a static coding
 {
	 System.out.println(grade[i]);
 }
 System.out.println("========by using for loops with length.method================");
 
   for(int a=0; a<=grade.length-1; a++)   //it is dynamic coding by using length.method
   {
	   System.out.println(grade[a]);
   }
 
	}

}
