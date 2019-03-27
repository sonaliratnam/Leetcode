import java.util.Scanner;

public class attendance {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	   // System.out.println(s);
	    int continuosL = 0;
	    char letter=0;
	    CharSequence seq1 = "A";
	    CharSequence seq2 = "L";
	    int count1 = 0,count2=0,n=0;
	    boolean bool1 = false,bool2 = false;
	    boolean isMatch = true; 
	    for (int counter = 0; counter < s.length() && isMatch; counter++) {
	        letter = s.charAt(counter);
	        if (letter != 'P' && letter != 'A' && letter != 'L' ) {
	            System.out.print("NO");
	            isMatch = false;
	        } 
	    }
	    if (isMatch) {
	        //System.out.print("YES");
	    	
	    	
	    		/*bool1=s.equals(seq1);
		    	count1++;
		    	
		    	bool2=s.equals(seq2);
		    	count2++;
		    	*/
	    	 	
		    	for( int i=0; i<s.length(); i++ ) {
		    	    if( s.charAt(i) == 'A' )  {
		    	        count1++;
		    	        continuosL = 0;
		    	    } 
		    	    else if ( s.charAt(i) == 'L' ) {
		    	    	continuosL++;
		    	    }
		    	    else continuosL = 0;
		    	    
		    	}
	    
	    	System.out.print(count1);
	    	System.out.print(continuosL);
	    	if(count1>1  ||  continuosL>2) {
	    		System.out.print("FALSE");
	    	}
	    	else System.out.print("TRUE");
	    	
	    }
	   
	}
	
}
