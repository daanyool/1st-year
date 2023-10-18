import java.util.Scanner;

public class ValueCalculator {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Price per pound package A: "); //price per pound for package A
    float priceA = obj.nextFloat();
        
    System.out.println("Percent lean package A: ");  //percent lean for package B
    float percentA = obj.nextFloat();
    
    System.out.println("Price per pound package B: "); //price per pound for A
    float priceB = obj.nextFloat();
    
    System.out.println("Percent lean package B: ");  //percent lean for B
    float percentB = obj.nextFloat();
    
    float amountA = priceA / (percentA / 100);  //cost per pound of lean in A
    float amountB = priceB / (percentB / 100);  //cost per pound of lean in B
    
    System.out.println("Package A cost per pound of lean" + amountA);
    System.out.println("Package B cost per pound of lean" + amountB);
    
    if(amountA<amountB) //if A is less than B, then A has the best value
      System.out.println("\nPackage A is the best value");
    else      //if B is less than A, then B has the best value
      System.out.println("\nPackage B is the best value");
   }
 }