import java.util.Scanner;

public class RunOfIntegers {
  public static void main(String[] args) {
    Scanner obj =new Scanner(System.in);
    
    System.out.println("Enter Start: ");
    int strt = obj.nextInt();
    
    System.out.println("Enter End: ");
    int end = obj.nextInt();
    
    System.out.println("\n");
    
    while(strt<=end) {
      System.out.println(strt);
      strt++;
      }
    }
 }