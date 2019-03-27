import java.util.Scanner;

class complement{  
    public static void main(String args[]){   
    	comple();
    }

	private static void comple() {
		 	String x = "";
		
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any decimal number:");
	       int n = s.nextInt();
	       //System.out.print(n);
	       while(n > 0)
	        {
	          int  a = n % 2;
	           
	            x = x + "" + a;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	      
	}  

}  