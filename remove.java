import java.util.Arrays;
import java.util.Scanner;

public class remove {
	
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		int count=0;
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(array));
	
		System.out.println("Enter the value that you want to delete");
		int val=sc.nextInt();
		
		int length=removeElement( array, val);
		
		System.out.println("The length is:"+" "+length);

	}

	private static int removeElement(int[] array, int val) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=val) {
				x++;
			}
		}
		return x;
	}

}
