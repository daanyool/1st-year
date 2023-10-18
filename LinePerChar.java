import java.util.Scanner;
/*This program asks the user to enter a string
  and the program echoes it to the monitor with
  one char per line. */

public class LinePerChar {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    char letter;
    
    //input a string
    System.out.println("Enter a string: ");
    String word = obj.nextLine();
    
    //echoes it with one character per line
    for(int a = 0; a<word.length(); a++) {
      letter = word.charAt(a);
      System.out.println(letter);
    }
  }
}