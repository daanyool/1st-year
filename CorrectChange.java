import java.util.Scanner;

public class CorrectChange
{
  public static void main(String[] args)
  {
    int change;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter change in cents: ");
    change = obj.nextInt();
    
    int dollar = change / 100;
    change = (change %= 100);
    
    int quarters = change / 25;
    change = (change %= 25);
    
    int dime = change / 10;
    change = (change %= 10);
    
    int nickel = change / 5;
    change = (change %= 5);
    
    System.out.println("Your change is: " + dollar + " dollar, " + quarters + " quarter, " + dime + " dime, " + nickel + " nickel, and " + change + " penny. ");
  }
}
    
    
