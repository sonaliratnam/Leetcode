package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        String nums[] = new String[n];
        System.out.println("Enter all the elements:");
        s.nextLine();
        for (i = 0; i < n; i++) 
        {
            nums[i] = s.nextLine();
        }
        
        
        System.out.print("Enter no. of elements you want in needle:");
        int m = s.nextInt();
        String needle[] = new String[m];
        System.out.println("Enter all the elements:");
        for (j = 0; j < m; j++) 
        {
            needle[j] = s.nextLine();
        }
        
        //code
        
        System.out.println(Arrays.toString(nums)+""+needle);
        for( i=0;i<nums.length;i++) {
        	
        }

	}

}
