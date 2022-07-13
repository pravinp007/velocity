package constructor;

public class Practiceconstructor {
       String fathername; 
       long phono;
       String collegename;
    public Practiceconstructor(String f,long ph,String cl)   //three parameter constructor
    {
    	fathername=f;
    	phono=ph;
    	collegename=cl;
    }
	public static void main(String[] args)
	{
	 
	Practiceconstructor obj=new Practiceconstructor("rajendra" ,9970073120l, "vit");
	 obj.anu("pravin", 14, 'A');
	}
 public void anu (String stdname, int rollno, char grade)  //non static method with parameters
 {
	 System.out.println(" student name is "+stdname);
	 System.out.println("my roll no is "+rollno);
	 System.out.println("my grade is "+grade);
	 System.out.println("fathername is "+fathername);
	 System.out.println("phono no is "+phono);
	 System.out.println("college name is "+collegename);
 }
}
