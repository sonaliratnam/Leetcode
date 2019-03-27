import java.util.Scanner;

class Jewel{  
    public static void main(String args[]){   
    reverse();
    }

	private static void reverse() {
		
		
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	     int n= s.length();
	    char[] revFor=s.toCharArray();
	    char[] revBack= new char[n];
	    
	    for(int i=0;i<revFor.length;i++){  
	    	//System.out.print(rev[i]);
	    	//System.out.print(revFor[n-i-1]);
	    	revBack[i]=revFor[n-i-1];
	    	System.out.print(revBack[i]);
	    	} 
	    
	   /* for(int i=0;i<revBack.length;i++) {
	    	System.out.print(revBack[i]);
	    } */
	//System.out.println(s);
	     /*for(int i=s.length()-1;i>=0;i--){
	         char c = s.charAt(i); 
	         System.out.println(c);
	         
	          }
	          */
	
	sc.close();
	}  

}  