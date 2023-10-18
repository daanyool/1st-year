import  java.util.Scanner;

// User repeatedly enters integer N.  
// Calculate and print N factorial.
// User enters a negative value to exit.

public class FactorialTester
{
  
  // Calculate num factorial
  public static long factorial( int num )
  {
    long fct = 1;
    
    if(num>=0 && num<21) {
      for ( int j=1; j<=num; j++ )
        fct *= j;
      return fct;
    }
    else 
      return -1;
  }
  
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    long fact; 
    int N;
    
    while(true) {
      System.out.print("Enter N (not less than 0 and not greater than 20): ");
      N = scan.nextInt();
      
      if(factorial(N)==-1)
         System.out.println("error: Out of range");
      else
         System.out.println("factorial is " + factorial(N));
    } 
  }
}