import java.util.Scanner;

public class UnluckyEvilNumbers {
   public static boolean Evil(long a) {
    int counter = 0;
    
    while(a > 0) {
      if(a%2==1)
        counter++;
      a = a / 2;
    }
    return counter%2==1;
  }

   public static boolean Unlucky(long n) {
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
      
      System.out.println("Enter a number: ");
      long n = obj.nextInt();
      
      for(int a = 1; a<=n; a++) {
         if(Unlucky(a)) {
           if(Evil(a))
             System.out.println(a + " is an unlucky Evil Number.");
           else
             System.out.println(a + " is an unlucky Number.");
         }
      }
   }
}