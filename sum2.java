import java.util.Scanner;

public class sum2 {
	public static void main(String args[])
    {
		long num;
		System.out.println("Enter the digits you want to sum:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextLong();
		scan.close();
		System.out.println(num);
		  long x= sumrecursive1(num);
		  System.out.println(x);
}

	private static long sumrecursive1(long num) {
		// TODO Auto-generated method stub
		
		//first calculation i.e sum of digits
		
		
		long sum = 0;
		sum=check(num);
    	System.out.println(sum);
    	int val=(int) (Math.log10(sum) + 1);
    	System.out.println(val);
    	
      //check if the length is greater than 2 , if yes then recursively call a maethod
    	
 
    		while(val>=2) {
    			 sum=check(sum);
        		val=(int) (Math.log10(sum) + 1);
    		
    		}
    		return sum;
    	

		
		
	}

	private static long check(long sum) {
		// TODO Auto-generated method stub
		//System.out.println("idiot");
		long sum1 = 0;
		 while (sum > 0) {
	        	
	             sum1 = sum1 + sum % 10;
	            sum = sum / 10;

	    }
		 return sum1;	
	}
    	
	}

