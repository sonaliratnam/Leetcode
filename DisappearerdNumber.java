import java.util.Scanner;

public class DisappearerdNumber {

	
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		int max,temp;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				temp=array[i];
				
			}
		}
		
		//System.out.println(max);
	}
}
