import java.util.Scanner;

public class OdiousNumbers {
  public static boolean Modulo(long a) {
    int counter = 0;
    
    while(a > 0) {
      if(a%2==1)
        counter++;
      a = a / 2;
    }
    return counter%2==1;
  }
 
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sum = 0; 
    boolean bool = false;
    
    do {
      System.out.println("to exit, enter a negative value.");
      System.out.println("Enter N: ");
      long n = obj.nextInt();
    
      if(n > 0) {    
        if(Modulo(n)) 
          System.out.println("Odious");
        else
          System.out.println("Evil");
        bool = true;
      }
      else
        bool = false;
        
      System.out.println();
    } while(bool = true);
  }
}
      
      