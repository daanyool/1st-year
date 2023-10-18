import java.util.Scanner;

public class MovieTicket {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    final double normalAdult = 8.00, matineeAdult = 5.00, normalChild = 4.00, matineeChild = 2.00;  //prices
    
    System.out.println("Enter Age: ");
    byte age = obj.nextByte();
    
    System.out.println("Time on a 24-hour clock: ");
    int time = obj.nextInt();
    
    
    if(age>13 && time>1700) {   //if age is greater than 13 and time is beyond 5 PM, then the price is 8
      System.out.println(normalAdult);
      if(age>13 && time<1700)    //if age is greater than 13 and time is earlier than 5 PM, then the price is 5
        System.out.println(matineeAdult);
    }
    else if(age<=13 && time>1700) {     //if age is less than or equal to 13 and time is beyond 5 PM, then the price is 4
      System.out.println(normalChild);
      if(age<=13 && time<1700)     //if age is less than or equal to 13 and time is earlier than 5 PM, then the price is 2
        System.out.println(matineeChild);
    }
    else if(time=>2460)   //no time beyond 24:59
      System.out.println("Wrong input!");
    }
 } 
 