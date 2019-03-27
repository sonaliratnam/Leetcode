
import java.util.Arrays;
import java.util.Scanner;

public class reverseWords {
	public static void main(String[] args) {
		 char[] x=null;
		 int i=0;
		 String string = "";
		 String m=null;
		System.out.println("Enter the words you want to reverse:");
		Scanner sc=new Scanner(System.in);
		String sampleString= sc.nextLine();
	 
	      String[] animals = sampleString.split(" ");
	      String[] out=new String[animals.length];
	      for( i=0;i<animals.length;i++) {
	    	x= animals[i].toCharArray();
	    	 char[] revBack= new char[x.length];
	    	 for(int j=0;j<x.length;j++){  
	 	    	revBack[j]=x[x.length-j-1];
	 	    	//System.out.print(revBack[j]);
	 	    	}
	    	
	    	 out[i]=String.valueOf(revBack);
	    	 
	    	 
	    	// 	  System.out.print(out);
	      }
	 	 
	     
	      for(int k=0;k<out.length;k++) {
	    	 m=out[k]+"  ";
	    	
	    	 String str = String.join(",", m);
	    	string+=String.valueOf(str);
	    	
	      }
	      System.out.println(string);
	   }


}

