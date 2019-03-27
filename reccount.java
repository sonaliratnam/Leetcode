package arrays;

import java.util.Scanner;

public class reccount {
	public static void main(String args[]) {
		  Scanner s = new Scanner(System.in);
		    String[] array = new String[3];
		    
		    System.out.println("Please enter 20 names to sort");

		    for (int i = 0; i < array.length; i++) {
		        array[i] = s.nextLine();
		    }

		    //Just to test
		    System.out.println(array[0]);
	}

}
