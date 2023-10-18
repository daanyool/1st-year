class Exercise2TwoArrays {
  public static void main ( String[] args ) {
    int[] val = {13, -4, 82, 17}; 
    int[] twice = new int[val.length];
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // Construct an array object for twice.
    
    for(int a = 0; a<val.length; a++) {
      twice[a] = val[a]*2;
    }
    
    // Put values in twice that are twice the
    // corresponding values in val.

    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }
}