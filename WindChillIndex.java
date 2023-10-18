import java.util.Scanner;

public class WindChillIndex {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter wind speed: ");
    double v = obj.nextDouble();  //for wind speed
    
    System.out.println("Enter temperature: ");
    double temp = obj.nextDouble();  //for temperature
    
    double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(v, .16)) + (0.4275 * temp * Math.pow(v, .16)); //formula for WCI
    
    if(v<3 || temp>50) //if wind speed is less than 3mph or temperature is greater than 50F
      System.out.println("Wind Chill: " + temp);
    else      //otherwise, formula will be executed
      System.out.println("Wind Chill: " + windChill);
    }
 }