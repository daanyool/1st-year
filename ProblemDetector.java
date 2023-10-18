import java.util.Scanner;

public class ProblemDetector {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Year of birth: "); 
    int birthYear = obj.nextInt();  //for birth year
    
    System.out.println("Current year: ");
    int currentYear = obj.nextInt();  //for current year
    
    if(birthYear==currentYear) { //if birth year is same as the current year
      currentYear += 2000;  
      birthYear += 1900;    
    }
    else if(birthYear>=00 && birthYear<=22) {  //if birth year is equal or is within 00 and 22
      birthYear += 2000;  
      if(currentYear>=00 && currentYear<=99)   //if current year is equal or between 00 and 99
        currentYear += 2000;
    }
    else if(birthYear>=23 && birthYear<=99) {   //if birth year is equal or between 23 and 99
      birthYear += 1900;
      if(currentYear>=00 && currentYear<=23)    //if current year is equal or between 00 and 23
        currentYear += 2000;
      else if(currentYear>=24 && currentYear<=99)  //if current year is equal or between 24 and 99
        currentYear += 1900;
    }
    
    System.out.println("Your Age: " + (currentYear - birthYear));  //calculating the age
  }
}
    