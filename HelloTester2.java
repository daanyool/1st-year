class HelloObject { 
  public String morning, evening;
  
  public HelloObject(String morning, String evening) {
    this.morning = morning;
    this.evening = evening;
  }
  
  public HelloObject(HelloObject init) {
    this
  
  public void morningGreet(String name) {
    System.out.println(morning + " " + name + "!");
  }
  
  public void eveningGreet(String name) {
    System.out.println(evening + " " + name + "!");
  }
}

public class HelloTester2 {
  public static void main (String[] args) {
    HelloObject anObject1 = new HelloObject("Good Morning", "Good Evening"); 
    String name = "World";
     
    anObject1.morningGreet(name);
    anObject1.eveningGreet(name);
   }
}