import java.util.Arrays;
import java.util.Scanner;

public class findMaxConsecutiveOnes {
	
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();

		int array[]=new int[elem];

		int count=0,temp=0;
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
	
}
		
		
		for(int i=0;i<elem;i++) {
				
				// 1 1 0 1 0 1   1 1 0 1 1 1 0
				//System.out.println(x+"x");
			
				if(array[i]==1) {
					
					count++;
					
				}
				
			
				//System.out.println(x);
			
					if(count>temp) {
					temp=count;  //2
					}
					if(array[i]==0) {
					count=0;
				}
				
				
				
				
		}
		
	
		System.out.println(temp);
		
	}
}


