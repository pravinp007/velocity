package myInterface;

public interface MotherSuperclass 
{
       void receipe();
       void care();
       
       default void money()  //astract method do not specify body thats why we give it default
       {
      	 System.out.println("hii this is mothers money");  
       }
       
       
       static void mymethod()     //default static method
       {
       	System.out.println("i am default static method from mothers class");
       }
       
       public static void mymethod1() {
       	System.out.println("i am public static method from mothers class");
       }
       
}
