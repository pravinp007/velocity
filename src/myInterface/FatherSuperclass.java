package myInterface;

public interface FatherSuperclass 
{
     void love();
     void nature();
     
   default void money()  //astract method do not specify body thats why we give it default
     {
    	 System.out.println("hii this is fathers money");  
     }
     
     
    static void mymethod()     //default static method
    {
    	System.out.println("i am default static method from fathers class");
    }
    
    public static void mymethod1() {
    	System.out.println("i am public static method from fathers class");
    }
}
