import java.util.Scanner;

public class AddingInt {
  public static void main(String[] args) {
    String chars;
    double x;
    Scanner obj = new Scanner(System.in);
    
    do {
       do {
          System.out.println("Enter a number: ");
          x = obj.nextDouble();
      
          if(x<0)
            System.out.println(">>>number must be positive<<<");
       } while(x<0);
       chars = obj.nextLine();
       System.out.println("Square root of " + x + " is " + Math.sqrt(x));
       do {
          System.out.print("Do you wish to continue? (yes or no) :");
          chars = obj.nextLine();
       } while(!chars.equalsIgnoreCase("yes") && !chars.equalsIgnoreCase("no"));
    }
    while(chars.equals("yes"));
    System.out.println("bye");
  }
}