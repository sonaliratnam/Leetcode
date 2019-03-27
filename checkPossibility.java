import java.util.Arrays;
import java.util.Scanner;

public class checkPossibility {
	public static void main(String args[]) {
		boolean bool = true;
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		int j=1;
		int temp=0;
		for(int i=0;i<array.length;i++) {
			if(j!=array.length) {
			if(array[i]>array[j]) {
				/*System.out.print(j);
				System.out.print(i);
				j++;*/
				temp=array[j];
				array[i]=temp-1;
				j++;
				
			}
			}
			
			
		}
		System.out.println(Arrays.toString(array));
		
		 
		for (int i = 0 ;i < array.length-1; i++) {
	        for (int k = i+1; k < array.length; k++) {
	             if (array[i] == array[k]) {
	                bool=false;
	             }
	        }
	    }  
		
	               
	        
		
		System.out.println(bool);
		return;
	}
}
