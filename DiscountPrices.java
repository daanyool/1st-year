import java.util.Scanner;

public class DiscountPrices {
   public static void main(String[] args) {
      int amount, discountedPrice;
      int discount;
      Scanner obj = new Scanner(System.in);
      
      System.out.println("Enter amount of purchases: ");
      amount = obj.nextInt();     //input of the amount of purchase
      
      discount = amount * 10 / 100;                       
      
      if(amount>=1000) {        //if the amount purchased is over 1000 cents
        discountedPrice = amount - discount;                
        System.out.println("Discounted price: " + discountedPrice);   //discount is applied
      }
      
      else                     //if amount is below 1000 cents
       System.out.println("Price: " + amount);  //discount is not applied
      }
  }
               