import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class containsDuplicate {
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
	
	
	boolean list=findBoolean(array);
	System.out.println(list);
}

private static boolean findBoolean(int[] array) {
	//return false;
	// TODO Auto-generated method stub
	boolean b=false;
	for(int i=0;i<array.length;i++) {
		int temp=array[i];
		System.out.println(temp+"first for loop");
		for(int j=i+1;j<array.length;j++) {
			System.out.println(temp+"second for loop");
			if(temp==array[j]) {
				b=true;
			}
			
		}
	}
	return b;
}
}
