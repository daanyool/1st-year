class HelloObject { 
  public String greet;
  
  public HelloObject(String greet) {
    this.greet = greet;
  }
  
  //repeat the call as many as  the characters
  public void speak() {
    for(int a = 0; a<greet.length(); a++)
      System.out.println(greet);
  }
}

public class Hello {
  public static void main (String[] args) {
    HelloObject anObject1 = new HelloObject("Hi");
    HelloObject anObject2 = new HelloObject("Hello");
    HelloObject anObject3 = new HelloObject("Good Morning");
    HelloObject anObject4 = new HelloObject("Good Day");
    
    anObject1.speak();
    anObject2.speak();
    anObject3.speak();
    anObject4.speak();
  }
}