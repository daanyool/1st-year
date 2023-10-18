import java.io.*;
import java.util.Scanner;

public class BetterDocuPrinter {
    public static void main(String[] args) 
    throws IOException {
       
            File file = new File("C:\\Users\\MarkDanyol\\Desktop\\Java Programming Files\\Chapter 44\\LinePerChar.java");
            Scanner obj = new Scanner(file);
            String line;
            boolean comment = false;
            int space = 0;
            
            //input text from the file
            while (obj.hasNextLine()) {     
                line = obj.nextLine().trim();
                
                //testing
                for (int n = 0 ; n < line.length() ; n++) {
                   switch (line.charAt(n)) {
                      case '/' :
                         if (n != line.length()-1) {
                            if (line.charAt(n+1) == '/') {
                               System.out.println(line.substring(line.indexOf('/'), line.length()));
                               comment = false;
                               space = 0;
                            }
                         }
                         break;
                    }
                 }
                 
                 if (line.startsWith("/*")) {
                    comment = true;
                    System.out.println(line);
                 } 
                 
                 else if (comment) 
                    System.out.println(line);
                

                if (line.endsWith("*/")) 
                    comment = false;
                
           }
      }
}