import java.util.Scanner;
import java.text.DecimalFormat;

public class BirthdayParadox {
  public static void main(String[] args) { 
    Scanner obj =new Scanner(System.in);
    DecimalFormat numForm = new DecimalFormat("00.00");
    double probDiff = 1, probSame = 1.0, probSameAns = 0;
   
    System.out.println("Number of guests: ");
    int n = obj.nextInt();
    
    if(n>365)
      System.out.println("probability = " + probDiff);
    else if(n==1)
      System.out.println("probability = 100%");
    else {
      for(double a = 1; a<n; a++) {
        probDiff = probDiff * ((365 - a)/365);
        if(probDiff<=.50) {
          System.out.println("There needs to be " + (int)(a) + " guests to have more than 50%");
          break;
        }
      }
      probSameAns = probSame - probDiff;
    
      System.out.println("\nThere is " + numForm.format(probSameAns*100) + "% chance that two of the guest share the same birthday");
      System.out.println("There is " + numForm.format(probDiff*100) + "% chance that none share a birthday");
    }
  }
}

    