import java.util.Scanner;

public class Combinations {
   public static int Factorial(int n, int r) {
      int n1 = 1, r1 = 1, diff = 1;
      
      if(n>=0 && n<21) {
         for(int a = 2; a<=n; a++) {
            n1 *= a;
         }
         for(int b = 2; b<=r; b++) {
            r1 *= b;
         }
         for(int c = 2; c<=n-r; c++) {
           diff *= c;
         }
         return n1 / (r1 * diff);
      }
      
      return -1;
   }
   
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      
      System.out.println("Enter n: ");
      int n = obj.nextInt();
      System.out.println("Enter r: ");
      int r = obj.nextInt();
      
      //error if n is out of range
      if(Factorial(n, r)==-1)
         System.out.println("error: Out of range");
      else
        System.out.println("factorial is: " + Factorial(n, r));
   }
}