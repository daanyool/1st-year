import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String password, ch; 
    int upper, lower, digit;
    boolean bool1 = false; 
    
    //initialize to 0 inside the do 
    do {
      lower = 0;
      upper = 0;
      digit = 0;
      
      System.out.println("Enter your password:");
      password = obj.nextLine();
      
      if(password.length()>=7) {
        for(int a = 0; a<password.length(); a++) {
          if(Character.isDigit(password.charAt(a)))
            digit++;
            
          else if(!Character.isDigit(password.charAt(a))) {
            ch = String.valueOf(password.charAt(a));
            if(ch.equals(ch.toUpperCase()))
              upper++;
            else if(ch.equals(ch.toLowerCase()))
              lower++;
          }
        }

        if(upper==0 || lower==0 || digit==0) {
          System.out.println("That password is not applicable.");
          bool1 = true;
        }
        else {
          System.out.println("Acceptable password.");
          bool1 = false;
        }
      }
      else {
        System.out.println("That password is not applicable.");
        bool1 = true;
      }
      
      System.out.println();
    }while(bool1==true);
  }
}