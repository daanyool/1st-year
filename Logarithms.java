import java.util.Scanner;

public class Logarithms {
   public static void main(String[] args) {
      double x, log;
      Scanner obj = new Scanner(System.in);
      
      System.out.println("Enter a double: ");
      x = obj.nextDouble();
      
      log = (Math.log(x)) / (Math.log(2));
      
      System.out.println("Base 2 log of " + x + " is " + log);
    }
 }