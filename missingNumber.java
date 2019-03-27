import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
	
	public static void main(String args[]) {
		int n, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.print(Arrays.toString(a));
       
        int[] newArray=new int[a.length+1];
        
for(int i=0;i<a.length;i++) {
			
			newArray[i]=a[i];
			/*if(i!=array[i]) {
				temp=i;
			}
			*/
		
		}



System.out.print(Arrays.toString(newArray));

for(int i=0;i<newArray.length;i++) {
	System.out.print(i);
	if(i!=newArray[i]) {
		temp=i;
		break;
	}
	}

System.out.print(temp);
}

    }
	


