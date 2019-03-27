package arrays;

import java.util.Scanner;

public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code to input String A
		Scanner scan= new Scanner(System.in);
		System.out.println("Input the String:");
		String A=scan.nextLine();
		System.out.println("The String is:"+A);
		
		//code to input String B
		System.out.println("Input the String:");
		String B=scan.nextLine();
		//System.out.println("The String is:"+B);
		
		//variables declaration
		 int i=0;
	     int j=A.length()-1;
	     String subTemp=null;
	     String sub=null;
	     boolean bool=false;
	    
	     //actual code
	     for(i=0;i<j;i++) {
	    	 sub=A.substring(1,j+1)+A.substring(0,1);
	    	 if(sub.equals(B)) {
	    		 bool=true;
	    	 }
	    	 
	    	 //System.out.println(sub);
	    	 A=sub;
	     }
	     
	     System.out.println(bool);
	     //System.out.println(sub+" "+subTemp);
	}

}
