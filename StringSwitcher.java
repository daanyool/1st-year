import java.util.Scanner;

public class StringSwitcher {
  public static void main (String[] args) {
    String phrase;
    String message = "Phrase is: ";
    
    while(true) {
    Scanner scan = new Scanner(System.in); 
    message = "";
    
    System.out.println("Enter acronym: ");
    phrase = scan.nextLine().trim().toUpperCase(); 
    
    boolean exit = phrase.isEmpty();
    if(exit) {
      System.out.print("Exit");
      break;
    }   
    scan = new Scanner(phrase);
       
       while(scan.hasNext()) {
        String acronym = scan.next().trim().toUpperCase();
    
        switch(phrase) {
          case "LOL":
            message = message + "Laugh Out Loud";
            break;
          case "BFF":
            message = message + "Best Friends Forever";
            break;
          case "SO":
            message = message + "Significant Other";
            break;
          case "THS":
          case "THKS":
          case "TX":
            message = message + "Thanks";
            break;
          case "SLR":
            message = message + "Sorry, Late Reply";
            break;
          case "BTW":
            message = message + "By The Way";
            break;
          case "FYI":
            message = message + "For Your Information";
            break;
          case "ASAP":
            message = message + "As Soon As Possible";
            break;
          case "IDK":
            message = message + "I Don't Know";
            break;
          case "ILY":
            message = message + "I Love You";
            break;
          default:
            message = message + "unknown";
          }
           System.out.println(message);
         }
 }
 }
 }
      