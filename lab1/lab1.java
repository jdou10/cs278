// Jingru Dou
// Feb 02 2022
// CS 278

public class lab1 {
	// This function is to print T and F(instead of 0 and 1)
		public static void checkvalue(int x) {
			if (x == 0)
				System.out.print("F");
			if (x == 1)
				System.out.print("T");
		} // end functions
		
      
		public static void main(String[] args) {
			int count = 0;
			int i1, i2, i3, i4, i5, i6, i7, i8;
			for(i1 = 0; i1 < 2; i1++) {
				for(i2 = 0; i2 < 2; i2++) {
					for(i3 = 0; i3 < 2; i3++) {
						for(i4 = 0; i4 < 2; i4++) {
							for(i5 = 0; i5 < 2; i5++) {
								for(i6 = 0; i6 < 2; i6++) {
									for(i7 = 0; i7 < 2; i7++) {
										for(i8 = 0; i8 < 2; i8++) {
											count = count + 1;
											System.out.println("Truth table " + count + " :");
											System.out.println("p   q   r   Proposition");
									      System.out.println("-------------------------");
											System.out.print("F   F   F      ");
											checkvalue(i1);
                                 System.out.println();
											System.out.print("F   F   T      ");
											checkvalue(i2);
                                 System.out.println();
											System.out.print("F   T   F      ");
											checkvalue(i3);
                                 System.out.println();
											System.out.print("F   T   T      ");
											checkvalue(i4);
                                 System.out.println();
											System.out.print("T   F   F      ");
											checkvalue(i5);
                                 System.out.println();
											System.out.print("T   F   T      ");
											checkvalue(i6);
                                 System.out.println();
											System.out.print("T   T   F      ");
											checkvalue(i7);
                                 System.out.println();
											System.out.print("T   T   T      ");
											checkvalue(i8);
                                 System.out.print("\n\n");
										} // end i8
									} // end i7
								} // end i6
							} // end i5
						} // end i4
					} // end i3
				} // end i2
			} // end i1
   } // end main
} // end class
