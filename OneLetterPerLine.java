import java.util.Scanner;

public class OneLetterPerLine {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int strtIndex = 0;
    char charIndex;
    
    System.out.print("Enter a word: ");
    String word = obj.nextLine();
    
    int wordLgth = word.length();
    
    while(strtIndex<wordLgth) {
      charIndex = word.charAt(strtIndex);
      System.out.println(charIndex);
      strtIndex++;
      }
    }
 }