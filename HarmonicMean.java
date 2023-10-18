import java.util.Scanner;

public class HarmonicMean
{
  public static void main(String[] args)
  {
    float x, y, aM;
    double hM;
    
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter x: ");
    x = obj.nextFloat();
    
    System.out.println("Enter y: ");
    y = obj.nextFloat();
    
    aM = (x + y) / 2;
    hM = 2 / (1 / x + 1 / y);
    
    System.out.println("Arithmetic Mean: \t" + aM);
    System.out.println("Harmonic \tMean: \t" + hM);
  }
}