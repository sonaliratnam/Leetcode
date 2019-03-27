package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class firstUniqueCharacter {
	 static final int NO_OF_CHARS = 256; 
	static char count[] = new char[NO_OF_CHARS]; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "leetcode"; 
		System.out.println(Arrays.toString(count));
        int index =  firstNonRepeating(str); 
        System.out.println(index == -1 ? "Either all characters are repeating or string " + 
                "is empty" : "First non-repeating character is " +  str.charAt(index));
	}

	private static int firstNonRepeating(String str) {
		// TODO Auto-generated method stub
		getCharCountArray(str); 
        int index = -1, i; 
       
        for (i = 0; i < str.length();  i++) 
        { 
         
			if (count[str.charAt(i)] == 1) 
            { 
                index = i; 
                break; 
            }    
        }   
        
      return index; 
	}

	private static void getCharCountArray(String str) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < str.length();  i++) 
             count[str.charAt(i)]++; 
		
	}

}
