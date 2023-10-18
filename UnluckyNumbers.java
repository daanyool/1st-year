import java.util.Scanner;

public class UnluckyNumbers {
   public static boolean Operation(long n) {
      long n2 = 0;
      String val = " ";
      
      while(n>0) {
         n2 = n % 10;
         n /= 10;
         val = String.valueOf(n2).concat(val);
      }
      return val.contains("13");
   }
   
   public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     long n = 0;
     
     System.out.println("to exit, enter negative integer.");
     
     do {
     System.out.println("Enter the value of n:");
     n = obj.nextInt();
     
     if(Operation(n)) 
       System.out.println(n + " is unlucky.");
     else
       System.out.println(n + " is safe");
     
     System.out.println(); 
     }
     while(n>0);
   }
}

  
       