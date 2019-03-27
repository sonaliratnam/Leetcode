package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twoSum {

	public static void main(String[] args) {
		
		int[] result=new int[2];
		Scanner sc=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("enter the target");
		int target=sc.nextInt();
		
		System.out.println("Enter the number of elements:");
		int elem=sc.nextInt();
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		//code begins
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				//System.out.println(i+" "+ j);
				if(array[i]+array[j]==target) {
					//System.out.println(i+" "+ j);
					result[0]=i;
					result[1]=j;
					
				}
				else
					continue;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
		
		

	}

}
