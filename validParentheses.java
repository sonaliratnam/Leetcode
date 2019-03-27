package arrays;

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    String s = sc.nextLine();
	    
	    Stack<Character> stack = new Stack<>();
	    
		//parsing the array to check for the parantheses
	    
	    while (!s.isEmpty()) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
               // return false;
            	System.out.println("false");
            }
        }
        System.out.println("true");
	    
	}

}
