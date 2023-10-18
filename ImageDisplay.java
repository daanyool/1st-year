import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageDisplay {
  private static char getCharacter(int val) {
    int range = val / 8;

    switch (range) {
      case 0: return ' ';
      case 1: return '.';
      case 2: return ',';
      case 3: return '-';
      case 4: return '+';
      case 5: return 'o';
      case 6: return 'O';
      default: return 'X';
    }
  }

  
  public static void main(String[] args) {
    try {
      File file = new File("image.txt");
      Scanner obj = new Scanner(file);
      
      int count = 0;
      while (obj.hasNextInt()) {
        int val = obj.nextInt();
        char chr = getCharacter(val);
        System.out.print(chr);

        if (count++ % 64 == 0) {
          System.out.println();
        }
      }
      
      obj.close();
    } catch (FileNotFoundException e) {
      System.out.println("The image file was not found.");
    }
  }
}