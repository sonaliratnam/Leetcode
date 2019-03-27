import java.util.Arrays;
import java.util.Scanner;

public class addStrings {
public static void main(String args[]) {
	System.out.println("Enter the number of elements:");
	Scanner sc=new Scanner(System.in);
	int elem=sc.nextInt();
	
	
	int array[]=new int[elem];

	
	System.out.println("Enter all the elements:");
	for(int i=0;i<elem;i++) {
		array[i]=sc.nextInt();
	}
	
	
	int list=findMajor(array);
	System.out.println(list);
}

private static int findMajor(int[] array) {
	//return false;
	// TODO Auto-generated method stub 
	int x=0;
	
	if(array.length==1) {
		x=array[0];
	}

		Arrays.sort(array);
		int count=1;
		int temp=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]==temp) {
				count++;
			
			if(count>(array.length/2)) 
				x=array[i];
			
			}
			else
			{
				count=1;
				temp=array[i];
				//System.out.println("c");
			}
		}
	
	
	return x;
}
}
