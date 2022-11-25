// Jingru Dou
// CS 278
// 02 March 2022

import java.util.Scanner;
import java.lang.Math;

public class lab3 {
    public static boolean isPrime (int n){
      if (n < 2)
         return false;

      for (int i = 2; i < Math.sqrt(n); i++) {
         if (n % i == 0)
            return false;
      }
      return true;
   } // end isPrime

   public static void buildSquareArray(int array[]) {
      for(int i = 0; i < array.length; i++) {
         array[i] = (int) Math.pow(i, 2);
      }
   } // end buildSquareArray


   public static void main(String[] args) {
      int[] array = new int [100];
      buildSquareArray(array);

      int x = 1;
      boolean theoremHolds = true;
      int p;

      while(x <= 9999 && theoremHolds) {
         x = x + 2;
         theoremHolds = false;
         for (int i = 0; !theoremHolds && array[i] <= x/2; i++) {
            p = x - 2 * array[i];
               if (isPrime(p))
                  theoremHolds = true;
         }
      }

      // testing theoremHolds
      if(theoremHolds == false)
         System.out.print("The counterexample is x: " + x);
      else
         System.out.print("The counterexample is not found.");
   } // end main
} // end class
