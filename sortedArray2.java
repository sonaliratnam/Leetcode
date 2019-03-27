import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sortedArray2 {
	
	
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
		 int x=0;
		 int y=0;
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		
		for (int i = 0; i < array.length; i++) 
        {
            for (int j = i+1 ; j < array.length ; j++)
            {
                if(array[i]+array[j]==target )
                {
                	System.out.println(array[i]);
                	System.out.println(array[j]);
                	x=i;
                	y=j;
                }
            }            
        }
		
		
		
		int arrli[]=new int[2];
		
		arrli[0]=x+1;
		arrli[1]=y+1;
			
		
		System.out.println(Arrays.toString(arrli));
  
		
	}

}
