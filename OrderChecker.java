import java.util.Scanner;

public class OrderChecker {
  public static void main(String[] args) {
    final int boltPrice = 5;   //5 cents per bolt
    final int nutPrice = 3;    //3 cents per nut
    final int washerPrice = 1;  //1 cent per washer
    
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Number of bolts: ");
    int bolts = obj.nextInt();       //entering number of bolts
    
    System.out.println("Number of nuts: ");
    int nuts = obj.nextInt();       //entering number of nuts

    System.out.println("Number of washers: ");
    int washers = obj.nextInt();     //entering number of washers
    
    if(nuts<bolts) {           //if nuts is less than bolts, then nuts are too few
      System.out.println("\nCheck the Order: too few nuts.\n");
      if(washers<(bolts*2))    //if washers is less than the twice of bolts, then washers are too few
        System.out.println("Check the Order: too few washers.\n");
     }
    else    //if the required number of bolts, nuts, and washers are met; order is ok
      System.out.println("Order is OK.\n");
      
    int totalCost = (bolts*boltPrice) + (nuts*nutPrice) + (washers*washerPrice); //calculating total cost
    
    System.out.println("Total cost: " + totalCost);
   }
}