//Declare a char variable, print its ASCII value using casting.
public class Question4 {

   public static void main(String[] args) {
     String name="Raju";
     for(int i=0;i<name.length();i++)
     {
      int value=name.charAt(i);
      System.out.print(value);
     }
   }
}