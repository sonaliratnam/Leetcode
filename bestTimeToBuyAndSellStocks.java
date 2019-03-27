package arrays;

import java.util.Scanner;

public class bestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int elem=sc.nextInt();
		int array[]=new int[elem];
		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		int profit=0;
		int  profitTotal=0;
		//code begins
		
			for(int j=0;j<array.length-1;j++) {
				
				
					if(array[j+1]>array[j] ) {
						
						profit=array[j+1]-array[j];
					
						profitTotal=profitTotal+profit;
						
						//System.out.println(profitTotal + " "+ "Profit Total");
					}
					
				}
				
				
		
		
		System.out.println(profitTotal);
		
	}

}
