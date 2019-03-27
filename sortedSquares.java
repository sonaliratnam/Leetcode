import java.util.Arrays;
import java.util.Scanner;

public class sortedSquares {
	
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]*array[i];
			
		}
		System.out.println(Arrays.toString(array));
		
		//sorting array now
		
		int temp=0;
		
		
		for (int i = 0; i < array.length-1; i++) 
        {
            for (int j = 0 ; j < array.length-i-1 ; j++)
            {
                if (array[i] < array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }            
        }
		
		System.out.println(Arrays.toString(array));
	
	
	}
}
