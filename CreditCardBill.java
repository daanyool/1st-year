import java.util.Scanner;
import java.text.*;

public class CreditCardBill {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    DecimalFormat numform = new DecimalFormat();
    int mnth = 1;
    double sumPay = 0;
    
    System.out.println("Beginning balance: ");
    double beginBal = obj.nextDouble();
    
    System.out.println("Monthly interest (in percent): ");
    double mnthInt = obj.nextDouble();
    
    System.out.println("Monthly payment: ");
    double mnthPay = obj.nextDouble();
    
    double bal = beginBal;
    
    while(bal>0) {
      System.out.print("month: " + mnth);
      System.out.print("\t\tbalance : " + numform.format(bal));
      System.out.println("\t\ttotal payment: " + (sumPay += mnthPay));
     
      if(bal<mnthPay)
        System.out.println("final payment: " + bal);
        
      mnth++;
      bal = (bal - mnthPay) + (bal * (mnthInt/100.0));
    }  
  }
}
        