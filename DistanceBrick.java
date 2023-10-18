import java.util.Scanner;

public class DistanceBrick
{
  public static void main(String[] args)
  {
    double d, t;
    final double g = 32.174;
    
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    t = obj.nextDouble();
    
    d =  (g * t * t) / 2;
    System.out.printf("Distance: " + d);
   }
 }