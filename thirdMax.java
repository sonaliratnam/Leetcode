package arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class thirdMax {
	public static void main(String args[]) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int n,max=0;
		int thirdMax=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = s.nextInt();
        }
        
        for(int i = 0; i < nums.length; i++) 
        {  
            // add all the elements to the HashSet  
            hs.add(nums[i]);
           
        } 
        
        int count=hs.size();
        max=nums[0];
        for(int i=0;i<nums.length;i++) {
        	
        	if(max<nums[i]) {
        		max=nums[i];
        		
        	}
        	
        }
        
       List<Integer> res= new ArrayList<Integer>(hs);
        Collections.sort(res);
        int third=res.get(res.size()-3);
        //System.out.println(third);
        
       
        
        if(hs.size()>= 3) {
       	System.out.println(third);
        }
        else {
       	System.out.println(res.size()-1);
       }
	}
	

}
