import java.util.Scanner;

public class OddIntegers {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sum = 0;
    
    System.out.println("Enter N: ");
    int n = obj.nextInt();
    
    for(int a = 1; a<=n; a++) {
      if((a%2)!=0)
        sum += a;
    }
    System.out.println("Sum of all odd integers: " + sum);
    System.out.println("N squared: " + Math.pow(n, 2));
  }
}