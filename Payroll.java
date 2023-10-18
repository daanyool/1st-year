import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    String loop;
    loop = loopResults();
  }
  
  public static double getHrsWrkd() {
    double hrsWrkd;
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter no. of hours worked: ");
    hrsWrkd = obj.nextDouble();
    return hrsWrkd;
  }
  
  public static double getRate() {
    double rate;
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter rate per hour: ");
    rate = obj.nextDouble();
    return rate;
  }
  
  public static double getOtHrs() {
    double otHrs;
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter no. of hours worked in overtime: ");
    otHrs = obj.nextDouble();
    return otHrs;
  }
  
  public static double computeGPay(double r, double h, double otPay) {
    double gross = r * h + otPay;
    return gross;
  }
  
  public static double computeOtPay(double otHrs, double r) {
    double otPay = 1.5 * r * otHrs;
    return otPay;
  }
  
  public static double computeTax(double g) {
    double tax = 0.0;
    if(g<=250000)
      tax = 0.0;
    else if(g>250000 && g<=400000)
      tax = g * 15 / 100;
    else if(g>400000 && g<=800000)
      tax = g * 20 / 100 + 22500;
    else if(g>800000 && g<=2000000)
      tax = g * 25 / 100 + 102500;
    else if(g>2000000 && g<=8000000)
      tax = g * 30 / 100 + 402500;
    else if(g>8000000)
      tax = g * 35 / 100 + 2202500;
    
    return tax;
  }
  
  public static double computeNetPay(double g, double t) {
    double netPay = g - t;
    return netPay;
  }
  
  public static void displayResults(double g, double ot, double t, double n) {
    System.out.println("Gross pay: " + g);
    System.out.println("Overtime pay: " + ot);
    System.out.println("Income tax: " + t);
    System.out.println("Net Pay: " + n);
  }
  
  public static String loopResults() {
    String c;
    Scanner obj = new Scanner(System.in);
    double rate, hrsWrkd, otHrs, tax, gross, otPay, netPay;
    
    do {
      hrsWrkd = getHrsWrkd();
      rate = getRate();
      otHrs = getOtHrs();
    
      otPay = computeOtPay(otHrs, rate);
      gross = computeGPay(hrsWrkd, rate, otPay);
      tax = computeTax(gross);
      netPay = computeNetPay(gross, tax);
    
      displayResults(gross, otPay, tax, netPay);
      
      do {
        System.out.print("Do you want to try again (Y or N)? ");
        c = obj.nextLine().toUpperCase();
      }
      while(!c.equals("Y") && !c.equals("N") && !c.equals("YES") && !c.equals("NO"));
    }
    while(c.equals("Y") || c.equals("YES"));
    System.out.print("Bye!");
    return c;
  }
}