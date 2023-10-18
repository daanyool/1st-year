import java.text.DecimalFormat;

public class DrugPotency {
  public static void main(String[] args) {
    double effFull = 100;
    int month = 0;
    DecimalFormat numForm = new DecimalFormat();
    
    System.out.print("\nMonth: " + month);
    System.out.print("\t\teffectiveness: " + numForm.format(effFull));
    
    while(effFull > 50) {
      effFull -= effFull * 0.04;
      
      System.out.print("\nMonth: " + ++month);
      System.out.print("\t\teffectiveness: " + numForm.format(effFull));
    }
    System.out.print("  DISCARDED");
  }
}