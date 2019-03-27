package arrays;

import java.util.Scanner;

class minCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		
		
		        int f1 = 0, f2 = 0;
		        for (int i = array.length - 1; i >= 0; --i) {
		            int f0 = array[i] + Math.min(f1, f2);
		            f2 = f1;
		            f1 = f0;
		        }
		        System.out.println( Math.min(f1, f2));
		    
	}

}
