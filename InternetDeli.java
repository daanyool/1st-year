import java.util.Scanner;

public class InternetDeli {
  public static void main(String[] args) {
    double delivery;
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the item: ");
    String item = obj.nextLine();    //name of the item
    
    System.out.println("Enter the price (in cents): ");
    double price = obj.nextFloat();     //price
    
    if(price<1000)   //single-branch condition
      delivery = 200;
    else
      delivery = 0;
    
    System.out.println("Overnight delivery (0==no, 1==yes): ");
    byte decision = obj.nextByte();
    
    if(decision==1)
      delivery += 300;
    else if(decision==0)
      delivery += 0;
      
    System.out.println("Invoice:");
    System.out.println("\t" + item + "\t" + price);
    System.out.println("\tdelivery\t" + delivery);
    System.out.println("\ttotal\t" + (price + delivery));
    }
 }
             