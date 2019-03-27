package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sortArrayByParity {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int A[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			A[i]=sc.nextInt();
		}
		
		int[] result = new int[A.length];
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                evens.add(A[i]);
            } else {
                odds.add(A[i]);
            }
        }
        
        for(int i = 0; i < A.length; i += 2) {
            result[i] = evens.get(i / 2);
        }
        
        for(int i = 1; i < A.length; i += 2) {
            result[i] = odds.get(i / 2);
        }
        
      System.out.println(Arrays.toString(result));
		
		
	}

}
