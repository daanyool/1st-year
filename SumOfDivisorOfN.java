import java.util.Scanner;

public class SumOfDivisorOfN {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sum = 0;
    
    System.out.println("Enter N:");
    int n = obj.nextInt();
    
    for(int a = 1; a<n; a++) {
      if(n%a==0)
        sum += a;
    }
    System.out.println("Sum: " + sum);
    if(sum==n)
      System.out.println(n + " is a perfect number");
  }
}