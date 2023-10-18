import java.util.Scanner;

public class WordTriangle {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int a = 0;
    String sub;
    
    System.out.print("Enter a word -->");
    String word = obj.nextLine();

    int len = word.length();

    while(a < len) {
      sub = word.substring(a++, len--);
      System.out.println(sub);
      for(int b = 0; b<a; b++)
        System.out.print(" ");
    }
  }
}