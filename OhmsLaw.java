import java.util.Scanner;

public class OhmsLaw
{
  public static void main(String[] args)
  { 
    int V, R;
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter voltage(V): ");
    V = obj.nextInt();
    
    System.out.println("Enter resistance(R): ");
    R = obj.nextInt();
    
    double I = (V + 0.0) / R;
    System.out.println("I = " + I + " amps.");
   }
}
    
    