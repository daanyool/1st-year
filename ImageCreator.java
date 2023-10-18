import java.io.*;

public class ImageCreator {
  
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("image.txt");

      for (int row = 0; row < 64; row++) {
        for (int col = 0; col < 64; col++) {
          int value = (row / 8) * 8;
          String valueString = String.valueOf(value) + "\n";
          fos.write(valueString.getBytes());
        }
      }

      fos.close();
      System.out.println("Image created successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred while creating the image.");
    }
  }
}