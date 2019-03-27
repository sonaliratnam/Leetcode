import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class sortArrayByParity {

	public static void main(String args[]) {
		
		int temp=0;
		
		//Code to input an array of numbers
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];
		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		int[] ans = new int[array.length];
		int t=0;
		
		//created a new array for even numbers and odd numbers so that they can be merged later
		
		//int arrayNew[]=new int[elem];;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				ans[t++]=array[i];
			}
		}
			
			for( int i=0;i<array.length;i++) {
				if(array[i]%2!=0) {
					ans[t++]=array[i];
				}
			
		}
			
			System.out.println(Arrays.toString(ans));
	}
}
			
	
