class HelloObject {
  private String greeting;

  public HelloObject(String greeting) {
    this.greeting = greeting;
  }
  
  public HelloObject(HelloObject init) {
    this.greeting = new String(init.greeting);
  }
  
   public String getSpeak() { 
    return greeting;
  }
  
  public void setSpeak(String greeting) {
    this.greeting = greeting;
  }
}

public class HelloTester4
{
  public static void main (String[] args)        
  {
    HelloObject anObject = new HelloObject("Hello World"); 
    String speak = anObject.getSpeak();
    System.out.println(speak);
  }
}