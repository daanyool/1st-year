import java.util.Scanner;

public class TriangleAndSquare {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sum = 0, sqr = 0;
    
    System.out.println("Enter n: ");
    int n = obj.nextInt();
    
    for(int b = 1; b<=n; b++) {
         sqr = b * b;
         for(int c = 1; c<=n; c++) {
           sum = sum + c;
           if(sum>=sqr)
             break;
         }
         if(sum-sqr==0)
           System.out.println(sum + " is both a triangle and square number.");
           sqr = 0;
           sum = 0;
    }
  }
}
         