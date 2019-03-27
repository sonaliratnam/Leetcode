import java.util.Scanner;

public class SearchInsert {
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
			System.out.println("Enter the element to be searched");
			int s=sc.nextInt();
			int result=0;
			for(int j=0;j<elem;j++) {
				
			
		
					if(s==0) {
						result=0;
					}
				
					else if(s==array[j]) {
					//System.out.println(j);
					
					result=j;
				}
				else if(s<array[j]) {   
					//	System.out.println(j);
						result=j;
						break;
					}
		
			else 
					{
					if(s!=array[j] && j==elem-1) {
						result=j+1;
					}
					
					
					
					
			} 
			}
			System.out.println(result);
		}
	}


