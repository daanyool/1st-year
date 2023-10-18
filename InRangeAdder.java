import java.util.Scanner;

public class InRangeAdder {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sumIn = 0, sumOut = 0, data = 1;
    
    System.out.println("In-range Adder");
    
    System.out.println("Low end of range:");
    int low = obj.nextInt();
    
    System.out.println("High end of range:");
    int high = obj.nextInt();
    
    while(data!=0) {
      System.out.println("Enter data:");
      data = obj.nextInt();
      
      if(data>=low && data<=high)
        sumIn += data;
      else
        sumOut += data;
    }
    System.out.println("Sum of in range values: " + sumIn);
    System.out.println("Sum of out range values: " + sumOut);
  }
}