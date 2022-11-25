// Jingru Dou
// 23 March 2022
// CS 278

import java.util.*;
import java.util.Scanner;

public class lab4 {
   public static void main(String[] args) {
      // Use Hashmap to easily generate the list using mathematical method
      // Set the value as y
      Set<Integer> y = new HashSet<>();
      int n;

      Scanner scanner = new Scanner(System.in);
      System.out.println("The program will generate all functions from X={a,b,c} to Y={1,...,n}.");
      System.out.print("Please enter the value of n: ");
      n = Integer.parseInt(scanner.nextLine()); // check once on the integer value
      scanner.close(); // close the scanner
      System.out.println();
      
      /* This for loop is to make sure the value entered greater 
         than one is working properly. If entered any value less
         than one, the nested for loop will not be working.
      */
      for(int i = 1; i <= n; i++) {
         y.add(i);
      }

      /* Initialization for counting each counter and to count
         the total number of functions. All the counter are set
         to zero and counting through three for loops.
      */
      int f = 1;
      int onetooneCounter = 0;
      int ontoCounter = 0;
      int bijectionCounter = 0;

      // Three nested for loop generates the value of f
      for(int i = 1; i <= n; i++) {
         for(int j = 1; j <= n; j++) {
            for(int k = 1; k <= n; k++) {
               System.out.print("f" + f + "(a)=" + i + "  ");
               System.out.print("f" + f + "(b)=" + j + "  ");
               System.out.print("f" + f + "(c)=" + k);
               System.out.println();
               
               // To check if the function is one-to-one or not
               // using boolean values.
               // Also counting the total number of one-to-one
               boolean onetoone = false;
               if((i == j) || (i == k) || (j == k)) {
                  System.out.print("f" + f + " is not one-to-one, ");
               } else {
                  System.out.print("f" + f + " is one-to-one, ");
                  onetooneCounter++;
                  onetoone = true;
               }
               
               // Remove the number added so it can be counting
               // properly in the next onto functions.
               y.remove((Integer) i);
               y.remove((Integer) j);
               y.remove((Integer) k);
               
               
               // To check if the function is onto or not
               // using boolean values.
               // Also counting the total number of onto functions
               boolean onto = false;
               if (y.isEmpty()) {
                  System.out.print("onto, ");
                  onto = true;
                  ontoCounter++;
               } else {
                  System.out.print("not onto, ");
               }
               
               // Remove the number added so it can be counting
               // properly in the next bijection functions.
               y.add((Integer) i);
               y.add((Integer) j);
               y.add((Integer) k);
               
               
               // To check if the function is bijection or not by
               // using if else function, is the number match both
               // onto and one-to-one method, then return true.
               // Also counting the total number of bijections
               if(onetoone && onto) {
                  System.out.print("and a bijection.");
                  bijectionCounter++;
               } else {
                  System.out.print("and not a bijection.");
               }

               System.out.println("\n");
               f++; // counting the total functions
            }
         }
      }
      int a = f - 1;
      // Conclusion of the total functions at the end
      // counted by using each counter to count the totals. 
      System.out.println("There are " + a + " functions total.");
      System.out.println(onetooneCounter + " of them are one-to-one.");
      System.out.println(ontoCounter + " of them are onto.");
      System.out.print(bijectionCounter + " of them are bijections.");
   } // end main
} // end class
