import java.util.Scanner;

public class SteamEngine {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Air temperature: ");
    float tAir = obj.nextFloat();
    
    System.out.println("Steam temperature:");
    float tSteam = obj. nextFloat();
    
    float efficiency = 1 - tAir / tSteam;  //formula for the efficiency
    
    if(tSteam<373) {  //single-branch condition
      efficiency = 0;
      System.out.println("Efficiency: " + efficiency);
      }
    else
      System.out.println("Efficiency: " + efficiency);
    }
}
      