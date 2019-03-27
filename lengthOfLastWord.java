import java.util.Scanner;

public class lengthOfLastWord {
	public static void main(String args[]) {
		String string = "";
		int count=0;
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    
	    
	    
	    String [] arrOfStr = s.split(" ");
		
	    for (String a : arrOfStr) {
	    	//System.out.println(a);
	    	count++;
	    	// System.out.print(count);
	    	//System.out.print(arrOfStr.length);
	    	 if(count==arrOfStr.length) {
	    		 System.out.println(a.length());
	    	 }
	    	
	    }
	   // System.out.print(count);
	}

}
