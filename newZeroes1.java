import java.util.Arrays;
import java.util.Scanner;

public class newZeroes1 {

	public static void main(String args[]) {
		 int i=0;
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();

		int array[] = new int[elem];

		int count=0;
		System.out.println("Enter all the elements:");
		
		for(i=0;i<elem;i++) {
			array[i]=sc.nextInt();
			
			
		}
		for(i=0;i<elem;i++) {
		
		if(array[i]==0 && i< array.length-1) {
			
		
			
			
		
			array[i]=array[i+1];
			array[i+1]=0;
			
			
			
		}
		}
		//.out.println(elem);
		
		System.out.print(Arrays.toString(array));
	}
}
