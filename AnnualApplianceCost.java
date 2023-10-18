import java.util.Scanner;

public class AnnualApplianceCost
{
  public static void main(String[] args)
  {
    float cost, kilowattHrs, annualCost;
    
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter cost per kilowatt-hour in cents: ");
    cost = obj.nextFloat();
    
    System.out.println("Enter kilowatt-hours used per year: ");
    kilowattHrs = obj.nextFloat();
    
    annualCost = (cost * kilowattHrs) / 100;    
    System.out.println("Annual Cost: " + annualCost);
  }
}