import java.util.Scanner;
import java.lang.Math;

public class lab6 {

   // recursive sum1
   public static int sum1(int n) {       
       // base case
       if (n == 0) 
           return 1;
       // inductive step
       int result = (int)Math.pow(2, n); // the formula of 2^i
       return result + sum1(n - 1);      
   } // end sum1

    
   // recursive sum2
   public static int sum2(int n) { 
      // base case    
      if (n == 1) {
          return n * (n + 1); // the formula of i(i+1)
      } else {
         // inductive step  
         return n * (n + 1) + sum2(n - 1);
      }
   } // end sum2
 

   // the main method for testing
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the value of n: ");
      int n = sc.nextInt();
      System.out.println("The value of the 1st summation is " + sum1(n));
      System.out.print("The value of the 2nd summation is " + sum2(n));
   } // end main
} // end class