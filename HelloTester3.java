import java.util.Scanner;

class HelloObject { 
  public String greet;
  
  public HelloObject() {
    System.out.println("Enter greeting: ");
    Scanner obj = new Scanner(System.in);
    greet = obj.nextLine();
  }
  
  public void speak() {
    System.out.println();
    System.out.println(greet);
  }
}

public class HelloTester3 {
  public static void main(String[] args) {
    HelloObject anObject1 = new HelloObject();
    
    anObject1.speak();
  }
}