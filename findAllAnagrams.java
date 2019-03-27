package arrays;

import java.util.Scanner;

public class findAllAnagrams {
	public static void main(String args[]) {
		
		final int MAX = 256;
		
		//need to enter two string
		//first enter  the s
		Scanner sc=new Scanner(System.in);
	    String s = sc.nextLine();
	    
	    //second enter the string 
	    String p= sc.nextLine();
	    
	    //System.out.println(s+ " "+ p);
	    
	    int Slength=s.length();
	    int Plength=p.length();
	    
	    char[] countP = new char[MAX]; 
        char[] countTW = new char[MAX];
        
        for (int i = 0; i < Plength; i++) 
        { 
            //(countP[p.charAt(i)])++;
            System.out.println( (p.charAt(i)));
           // (countTW[s.charAt(i)])++;
            System.out.println( (countP[p.charAt(i)])++);
        } 
	}

}
