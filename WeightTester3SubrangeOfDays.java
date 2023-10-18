class Weight {
  private int[] data;
  
  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j<data.length; j++) {
      data[j] = init[j];
    }
  }
    
  //Average
  public int average() {
    int sum = 0;
    for(int a = 0; a<data.length; a++) {
      sum += data[a];
    }
    return sum/data.length;
  }
  
  public int subAverage(int start, int end) {
     int sum = 0;
     int count = end - start + 1;
     
     for(int a = start; a<=end; a++) {
       sum += data[a];
     }
     return sum / count;
  }
 }

public class WeightTester3SubrangeOfDays {
  public static void main (String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight(values);
    int avg = june.average();
    System.out.println("average = " + avg );
    
    int middleDay = values.length / 2;
    
    int firstHalf = june.subAverage(0, middleDay);
    int secondHalf = june.subAverage(middleDay, values.length-1);
    
    System.out.println("First half average: " + firstHalf);
    System.out.println("Second half average: " + secondHalf);
    System.out.println("Difference: " + Math.abs(firstHalf - secondHalf));
    
  }
}   