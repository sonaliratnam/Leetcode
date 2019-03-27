import java.util.Scanner;

public class sum {
	public static void main(String args[])
    {
        
		  long x= sumrecursive1();
	
		
}

	private static long sumrecursive1() {
		// TODO Auto-generated method stub
		System.out.println("Enter the digits you want to sum:");
		long num;
		long sum1 = 0;
		Scanner scan=new Scanner(System.in);
		num=scan.nextLong();
		scan.close();
		System.out.println(num);
		long sum = 0;

        while (num > 0) {
        	
            sum = sum + num % 10;
            num = num / 10;

    }
    	System.out.println(sum);
    	
    	int val=(int) (Math.log10(sum) + 1);
    	System.out.println(val);
    	
    	if(val>=2)
    	{
    		
    		
			//System.out.println("idiot");
    		 while (sum > 0) {
    	        	
    	             sum1 = sum1 + sum % 10;
    	            sum = sum / 10;

    	    }
    		 System.out.println(sum1);
    	}
		return sum1;
	}
    	
	}

