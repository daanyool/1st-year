import java.util.Scanner;

public class LastChanceGas {
  public static void main(String[] args) {
    final int miles = 200;
    
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Tank capacity: ");
    int gasCap = obj.nextInt();  //input tank capacity
    
    System.out.println("Gauge reading (in percent): ");
    int gasGauge = obj.nextInt();  //input gas gauge in percent

    System.out.println("Miles per gallon: ");
    int milesPerGallon = obj.nextInt();   //input miles per gallon
    
    int decision = (gasCap * gasGauge / 100) * milesPerGallon;  
    
    if(decision<miles)  //if the decision is less than 200 miles, then get gas
      System.out.println("Get Gas!");
      
    else    //if decision can make the car cross or reach 200 miles, then safe to proceed
      System.out.println("Safe to Proceed");
    }
 }