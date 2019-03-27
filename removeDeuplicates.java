package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class removeDeuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter all the elements:");
        s.nextLine();
        for (i = 0; i < n; i++) 
        {
            nums[i] = s.nextInt();
        }
       
       
            i=0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            System.out.println(i+1);
        }
        
       
	}


