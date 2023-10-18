import java.util.Scanner;

public class FantasyGame {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Welcome to Yertle's Quest");
    
    System.out.println("Enter the name of your character: ");
    String charName = obj.nextLine();
    
    System.out.println("Enter strength (1-10): ");
    int strgth = obj.nextInt();
    
    System.out.println("Enter health (1-10): ");
    int hlth = obj.nextInt();
    
    System.out.println("Enter luck (1-10): ");
    int luck = obj.nextInt();
    
    int sum = strgth + hlth + luck;  //total points
    
    if(sum>=15) {    //the three characteristics are equal if sum is more than or equal to 15
      strgth = 5;
      hlth = 5;
      luck = 5;
      System.out.println("You have give your character too many points! Default values have been assigned:");
      System.out.println(charName + ", strength: " + strgth + ", health: " + hlth + ", luck: " + luck);
      } 
    else    //executing points entered
      System.out.println(charName + ", strength: " + strgth + ", health: " + hlth + ", luck: " + luck);
    }
 }