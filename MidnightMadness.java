import java.util.Scanner;

public class MidnightMadness {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      final double normalAdult = 8.00, matineeAdult = 5.00;  //prices
      
      System.out.println("Enter Age: ");
      byte age = obj.nextByte();
      
      System.out.println("Time on a 24-hour clock: ");
      int time = obj.nextInt();
      
    if(age>13 && time>1700) {     //first condition
      System.out.println(normalAdult);
      if(age>13 && time<1700)      // condition inside the first condition
        System.out.println(matineeAdult);
    }
    else if(age<=13 && time>1700) {   //second condition
      System.out.println(normalChild);
      if(age<=13 && time<1700)       //condition inside the second condition
        System.out.println(matineeChild);
    }
    else if(age>13 && time>2200) {    //third condition
      System.out.println(normalAdult + 4.00);
      if(age>13 && time<2200)        //condition inside the third
        System.out.println(matineeAdult + 4.00);
      }
    else if(age<=13 && time>2200)     //fourth condition
      System.out.println("no children allowed");
    else if(time>2460)                 //fifth condition
      System.out.println("Wrong input!");
   }
} 
