class Exercise5ReverseOrder
{
  public static void main ( String[] args )
  {
    int[] val = {21}; 
    int temp;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
 
    temp = val[3];
    val[3] = val[0];
    val[0] = temp;
    
    temp = val[1];
    val[1] = val[2];
    val[2] = temp;
    
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}