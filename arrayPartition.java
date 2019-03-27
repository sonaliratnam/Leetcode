package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
			System.out.print(Arrays.toString(array));
			
			Arrays.sort(array);
			int ans = 0;
		    for(int i1=0; i1<array.length; i1+=2) {
		    	ans += array[i1]; 
		    }
		    System.out.print(ans);
		    return;
		    
	}

}
