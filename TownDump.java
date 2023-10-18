import java.util.Scanner;

public class TownDump {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Weight of load of trash (lbs): ");
    float weight = obj.nextFloat();
    
    float charge = 20;  //for every 200
    
    if(weight>=200)
      charge = 20;
      weight -= 200;
    
    if((weight-200)>=100)  //additional 8$ for every 100 lbs above 200
      charge += (weight / 100) * 8;
      
    System.out.println("charge: $" + charge);
    }
 }