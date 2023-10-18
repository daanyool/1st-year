import java.util.Scanner;

public class Microwave {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Number of items: ");
    int numItems = obj.nextInt();
    
    System.out.println("Heating time: ");
    int time = obj.nextInt();
    
    if(numItems==1) {  //first single-branch condition
      time += 0;
      int time1 = time/100;   //calculating minutes
      int time2 = time%100;   //calculating seconds
      System.out.println("Heat for " + time1 + " minutes " + time2 + " seconds");
    }
    
    if(numItems==2) {     //second single-branch condition
      time = (int)(time * .50) + time;  //adding 50%
      int time1 = time/100;
      int time2 = time%100;
      System.out.println("Heat for " + time1 + " minutes " + time2 + " seconds");
    }
    
    if(numItems==3) {     //third single-branch condition
      time *= 2;  //doubled the time
      int time1 = time/100;
      int time2 = time%100;
      System.out.println("Heat for " + time1 + " minutes " + time2 + " seconds");
    }
      
    if(numItems>3)        //fourth single-branch condition
      System.out.println("not allowed.");  
    }
 }