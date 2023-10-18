import java.util.Scanner;

public class FilePrompt {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    final String ext = ".dat";
    char numChar = ' ';
    String space = " ";
    byte counter = 0;
    
    do {
      System.out.println("Input file: ");
      String fileName = obj.nextLine();  
      
      if(fileName.length()<4) {
        System.out.println("error!");
        counter++;
      }
      else {    
        String extension = fileName.substring(fileName.length()-4);
        counter = 0;
      
          if(fileName.equals(ext)) {
            System.out.println(">>>file name is missing<<<");
            counter++;
          }
      
          if(!fileName.endsWith(extension)) {
            System.out.println(">>>file name must end with " + ext + "<<<");
            counter++;
          }
            
          for(int a = 1; a<fileName.length(); a++) {
            numChar = fileName.charAt(a);
            switch(numChar) {
              case ' ':
                System.out.println(">>>file name must not contain spaces<<<");
                counter++;
            }
          }
          }
        }
    while(counter!=0);
    System.out.println("OK");
   }
 }
      