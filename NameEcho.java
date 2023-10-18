import java.util.Scanner;

public class NameEcho {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    char chr;
    byte counter = 0;
    
    System.out.print("Enter your name: ");
    String name = obj.nextLine().trim();
    
    for(int a = 0; a<name.length(); a++) {
      chr = name.charAt(a);
      switch(chr) {
        case ' ': counter++; break;
      }
    } 
    if(counter!=0) {
      int spaceIndex = name.lastIndexOf(" ");
      String lastName = name.substring(spaceIndex).toUpperCase();
      String firstName = name.substring(0, spaceIndex);
    
      System.out.println(firstName + lastName);
    }
    else 
      System.out.println(name);
  }
}