import java.util.Scanner;

public class MicrowaveMenu {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    char chr;
    
    //input time in String
    System.out.print("Enter cook time-> ");
    String time = obj.nextLine();

    if(time.length()==1)
      System.out.println("00:0" + time);
    else if(time.length()==2)
      System.out.println("00:" + time);
    else if(time.length()>2) {
      String str1 = time.substring(time.length()-2);
      String str2 = time.substring(0, time.length()-2);

      System.out.print("Your time-> " + str2 + ":" + str1);
    }
  }
}