import java.util.Scanner;
import java.text.*;

public class AgeInSeconds {
  public static void main(String[] args) {
    final double lifespan = 2500000000l;  //max 
    DecimalFormat numForm = new DecimalFormat("0.00");  //having 2 decimal places
    DecimalFormat decForm = new DecimalFormat();
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Year: ");
    double year = obj.nextDouble();
    
    System.out.println("Month: ");
    double month = obj.nextDouble();
    
    System.out.println("Day: ");
    double day = obj.nextDouble();
    
    if(month==1)  //Jan
      month = 31;
    if(month==2)  //Feb
      month = 59;
    if(month==3)  //Mar
      month = 90;
    if(month==4)  //Apr
      month = 120;
    if(month==5)  //May
      month = 151;
    if(month==6)  //Jun
      month = 181;
    if(month==7)  //Jul
      month = 212;
    if(month==8)  //Aug
      month = 243;
    if(month==9)  //Sept
      month = 273;
    if(month==10)  //Oct
      month = 304;
    if(month==11)  //Nov
      month = 334;
    if(month==12)  //Dec
      month = 365;
      
    double dayPerYear = year * 365;
    double hrs = (dayPerYear + month + day) * 24;
    double mins = hrs * 60;
    double secs = mins * 60;
    
    System.out.println("Age in seconds: " + decForm.format(secs) + " seconds"); 
    System.out.println("Lifespan you have lived: " +numForm.format((secs / lifespan) * 100) + "%"); //calculating what percent is age in seconds of lifespan
    }
 }