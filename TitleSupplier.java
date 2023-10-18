import java.util.Scanner;

public class TitleSupplier {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String name, capWord;
    int len;
    String str1, str2, cmpltName;
    
    do {
      System.out.println("Enter a name: ");
      name = obj.nextLine().trim();
      
      if(name.length()==0) 
        break;
      else {
        str1 = name.substring(0,1).toUpperCase();
        str2 = name.substring(1).toLowerCase();
        cmpltName = str1.concat(str2);
  
        if(cmpltName.startsWith("Amy") || cmpltName.startsWith("Buffy") || cmpltName.startsWith("Cathy"))
          System.out.println("Ms. " + cmpltName);
        else if(cmpltName.startsWith("Elroy") || cmpltName.startsWith("Fred") || cmpltName.startsWith("Graham"))
          System.out.println("Mr. " + cmpltName);
        else
          System.out.println(cmpltName);
      }  
      System.out.println();
    }
    while(name.length()!=0);
  }
}
    
      