import java.util.Scanner;

public class FurtherSubstringFun
{
  public static void main(String[] args)
  {
    String stringOrig, newString;
    int indexBegin, indexEnd;
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a String: ");
    stringOrig = obj.nextLine();
    
    System.out.println("Enter beginning index: ");
    indexBegin = obj.nextInt();
    
    System.out.println("Enter ending index: ");
    indexEnd = obj.nextInt();
    
    newString = stringOrig.substring(indexBegin, indexEnd);
    
    System.out.println("Original String: \t" + stringOrig);
    System.out.println("\nSubstring: \t" + newString);
    
  }
}