import java.util.Scanner;

public class PieEatingContest {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter your weight in pounds: ");
    int pound = obj.nextInt();  //input weight in pounds
    
    if(pound>=30 && pound<=250)  //if weight is equal or is between 30 lbs and 250 lbs, then allowed
      System.out.println("Allowed.");
    else     //if weight is below 30 lbs or 250 lbs, then not allowed
      System.out.println("Not Allowed.");
   }
 }