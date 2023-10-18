import java.util.Scanner;

public class MilesPerGallon {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double intlMiles = 0, fnlMiles = 0, gallons = 0;
    
    System.out.println("Miles Per Gallon Program");
    
    while(intlMiles>-1) {
      System.out.println("\nInitial miles: ");
      intlMiles = obj.nextDouble();
    
      if(intlMiles>-1) {
        System.out.println("Final miles: ");
        fnlMiles = obj.nextDouble();
      
        System.out.println("Gallons: ");
        gallons = obj.nextDouble();
      
        System.out.println("Miles per gallon: " + ((fnlMiles - intlMiles) / gallons));
      }
    }   
    System.out.println("bye!");
  }
}