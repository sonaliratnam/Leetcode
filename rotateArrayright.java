import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayright {
	
	public static void main(String args[]) {
		
			System.out.println("Enter the number of elements:");
			Scanner sc=new Scanner(System.in);
			int elem=sc.nextInt();
			
			
			int array[]=new int[elem];

			
			System.out.println("Enter all the elements:");
			for(int i=0;i<elem;i++) {
				array[i]=sc.nextInt();
			}
			
			
			
			System.out.println("Enter the value of k");
			int k=sc.nextInt();
			
			int temp,prev=0;
			
			for(int i=0;i<array.length-k;i++)		 {
				
				array[i]=array[i+k];
			
				
				
														}
			
			
			System.out.println(Arrays.toString(array));
			
			
			}
			
			
			
	}


