import java.util.Scanner;


public class lab2p {
    
   public static boolean booleanTruthValues[] = {true, false};
   
   public static char charTruthValues[] = {'T', 'F'}; 
   
   public static char booleanToChar(boolean b) {
      return b ? 'T' : 'F';
   }
  
   public static boolean charToBoolean(char c) {
      if (c != 'T' && c != 'F')
         throw new IllegalArgumentException("Cannot convert '" + c + "' to boolean.");
      return (c == 'T' ? true : false);
   }

   public static char and(char p1, char q1) {
      boolean p = false, q = false;
      try { 
         p = charToBoolean(p1);
      }
      catch (Exception e) {
         System.out.println( "In method and: Unable to convert '" + p1 
             + "' to boolean.\n1st parameter must be 'T' or 'F'.");
      }
      try { 
         q = charToBoolean(q1);
      }
      catch (Exception e) {
         System.out.println( "In method and: Unable to convert '" + q1 
             + "' to boolean.\n2nd parameter must be 'T' or 'F'.");
      }

      return booleanToChar(p && q);   
   } // end and
   
   public static char implies( char p1, char q1 ) {
      boolean p = false, q = false;
      try { 
         p = charToBoolean(p1);
      }
      catch (Exception e) {
         System.out.println( "In method implies: Unable to convert '" + p1 
             + "' to boolean.\n1st parameter must be 'T' or 'F'.");
      }
      try { 
         q = charToBoolean(q1);
      }
      catch (Exception e) {
         System.out.println( "In method implies: Unable to convert '" + q1 
             + "' to boolean.\n2nd parameter must be 'T' or 'F'.");
      }

      return booleanToChar(!p || q);   
   } // end implies
   
   
   public static boolean statementA(int[] nums){
	// use for each loop that iterates over the integer array
		for(int number : nums){
			char lhs = booleanToChar(number < 0);
			char rhs = booleanToChar((number & 1) == 1);
			char result = implies(lhs, rhs);
			boolean status = charToBoolean(result);
			// return statement
	        if(!status){
	        	return false;
	        }
		}
	    return true;
	} // end statement a)
	   
    public static boolean statementB(int[] nums){
        for(int number : nums){
			char lhs = booleanToChar(number < 0);
			char rhs = booleanToChar((number & 1) == 1);
            char result = implies(lhs, rhs);
			boolean status = charToBoolean(result);
            if(status){
                return true;
            }
        }
        return false;
    } // end statement b)
	
	public static boolean statementC(int[] nums){
	    for(int number : nums){
			char lhs = booleanToChar(number < 0);
			char rhs = booleanToChar((number & 1) == 1);
	        char result = and(lhs, rhs);
			boolean status = charToBoolean(result);
	        if(status){
	            return true;
	        }
	    }
	    return false;
	} // end statement c)

   
    public static boolean statementD(int[] nums){
        for(int number : nums) {
			char lhs = booleanToChar(number % 3 == 0);
			char rhs = booleanToChar(number % 5 == 0);
			char result = implies(lhs,rhs);
            boolean status = charToBoolean(result);
            if(!status){
	        	return false;
	        }
		}
	    return true;
    } // end statement d)
    
    public static boolean statementE(int[] nums){
        for(int number : nums) {
        	char lhs = booleanToChar(number % 3 == 0);
			char rhs = booleanToChar(number % 5 == 0);
			char result = implies(lhs,rhs);
            boolean status = charToBoolean(result);
            if(status){
	            return true;
	        }
	    }
	    return false;
    } // end statement e)

    // the main method to test all the statements
    public static void main(String[] args) {
    // declare an integer array and allocate space for 10 elements.
    	int[] nums = new int[10];
    	try (Scanner scan = new Scanner(System.in)) {
    		for(int i = 0; i < nums.length; i++){
    		nums[i] = scan.nextInt();
    		}
    	}
      System.out.println("a) is " + statementA(nums));
      System.out.println("b) is " + statementB(nums));
      System.out.println("c) is " + statementC(nums));
      System.out.println("d) is " + statementD(nums));
      System.out.println("e) is " + statementE(nums));
	} // end main
} // end class
