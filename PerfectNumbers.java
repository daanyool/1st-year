import java.util.Scanner;

public class PerfectNumbers {
   public static boolean Perfect(int n) {
      int num = 0;
      
      for(int a = 1; a<n; a++) {
         if(n%a==0)
           num += a;
      }
       return num==n;
   }
   
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      
      System.out.println("Enter a number: ");
      long n = obj.nextInt();
      
      for(int a= 1; a<n; a++) {
        if(Perfect(a))
          System.out.println(a + " is a Perfect Number.");     
      }
   }
}
               
      