package arrays;

import java.util.Scanner;

public class primeNumberOfSetBits {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		//Enter the low and high values
		int low=sc.nextInt();
		int high=sc.nextInt();
		
		int count=0;
		//System.out.println(count);
		
		for(int i=low ; i<=high ; i++){
			  //System.out.println(Integer.bitCount(i));
			 // System.out.println("Number of one bits = " + Integer.bitCount(i)); 
			  if (isSmallPrime(Integer.bitCount(i)))
			  {
				  count++;
			  }
			  
			
			}
		
		System.out.println(count);
	}
	
	

	private static boolean isSmallPrime(int x) {
		// TODO Auto-generated method stub
		 return (x == 2 || x == 3 || x == 5 || x == 7 ||
	                x == 11 || x == 13 || x == 17 || x == 19);
		}
		
	}


	


