import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Random;

public class lab5 {
   // printSolution to print out first 100 elements
   public static void printSolution(int[] table) {
      System.out.println("The first 100 elements of the seqence: ");
      int k = 0;
      // for loop make sure prints out 10 values per line
      for(int i = 0; i < 10; i++) {
         for(int j = 0; j < 10; j++) {
            System.out.printf("%5d ", table[k]);
            k++;
         }
         System.out.println();
      }
      return;
   }
   
   // drivers
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter values of a, b, c, and M in this order: ");
      int a, b, c, M, i, j;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      M = sc.nextInt();
      int[] table = new int[100]; // insert the table
      int x = c;
      for(i = 0; i < 100; i++) {
         table[i] = x;
         x = (a * x + b) % M; // formula
      }
      System.out.print("The first 100 elements of the sequence: ");
      printSolution(table);
      System.out.println();
      
      // implementing Floyd's algorithm to find the cycle length
      int slow = c;
      int fast = (a * c + b) % M;
                 
      //  find a point on the cycle (Phase (i))
      while(true) {
         if (slow == fast) {
            break;
         }
         slow = (a * slow + b) % M; // one time
         fast = (a * fast + b) % M; // two time
         fast = (a * fast + b) % M;
      } // end while
      
      //  compute the cycle length (Phase (ii))
      int count = 1;
      int res = (a * slow + b) % M;
      
      while(res != slow) {
         count++;
         res = (a * res + b) % M;  
      } // end while 
       
      System.out.printf("Cycle length is " + count);
   } // end main
} // end class