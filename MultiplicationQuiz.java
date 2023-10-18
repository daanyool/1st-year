import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Random rand = new Random();
    
    int counter = 1, correctAns = 0;
    
    while(counter<=10) {
      int multInt1 = rand.nextInt(9);
      int multInt2 = rand.nextInt(9);
      
      System.out.println("What is " + multInt1 + "*" + multInt2 + " : ");
      int ans = obj.nextInt();
      
      if(ans==(multInt1*multInt2)) {
        System.out.println("Right!");
        correctAns++;
        }
      else
        System.out.println("Wrong. " + multInt1 + " * " + multInt2 + " is " + (multInt1*multInt2));
      counter++;
      }
    System.out.println("\nYou got " + correctAns + " out of 10 questions correct!");
    }
 }