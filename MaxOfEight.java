public class MaxOfEight {
   public static int maxEight( int A, int B, int C, int D,
      int E, int F, int G, int H) {
         if(A>B) {
            if(A>C) {
               if(A>D) {
                  if(A>E) {
                     if(A>F) {
                        if(A>G) {
                           if(A>H) {
                              return A;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(B>C) {
            if(B>D) {
               if(B>E) {
                  if(B>F) {
                     if(B>G) {
                        if(B>H) {
                           return B;
                        }
                     }
                  }
               }
            }
         }

         if(C>D) {
            if(C>E) {
               if(C>F) {
                  if(C>G) {
                     if(C>H) {
                        return C;
                     }
                  }
               }
            }
         }

         if(D>E) {
            if(D>F) {
               if(D>G) {
                  if(D>H) {
                     return D;
                  }
               }
            }
         }

         if(E>F) {
            if(E>G) {
               if(E>H) {
                  return E;
               }
            }
         }

         if(F>G) {
            if(F>H) {
               return F;
            }
         }

         if(G>H)
            return G;

         return H;
   }

   public static void main (String[] args ) {
      int A= 1, B= 3, C= 4, D= 30, E= 45, F= 7, G= 21, H= 7;
      
      System.out.println("The max of "
      + A + ", " + B + ", " + C + ", " + D + ", "
      + E + ", " + F + ", " + G + ", " + H
      + " is: " +
      maxEight(A, B, C, D, E, F, G, H));
   }
}