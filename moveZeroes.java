import java.util.Arrays;
import java.util.Scanner;

public class moveZeroes {
	public static void main(String[] args) {

		int i=0,n=0;
		int x=0;
		int c = 0;
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();

		int array[]=new int[elem];

		int count=0;
		System.out.println("Enter all the elements:");
		for(i=0;i<elem;i++) {
			array[i]=sc.nextInt();
			if(array[i]==0) {
				count++;
				//zero[i]=array[i];
			}
			int zero[]=new int[elem];
		}
		int zero[]=new int[count];
		//code to check if any zeroes in the array
		
		for(i=0;i<elem;i++) {
			if(array[i]==0) {
			for(int j=0;j<count;j++) {
				zero[j]=array[i];
			}


		}
		}
		
		int targetIndex = 0;
		for( int sourceIndex = 0;  sourceIndex < array.length;  sourceIndex++ )
		{
		    if( array[sourceIndex] != 0 )
		        array[targetIndex++] = array[sourceIndex];
		}
		int[] newArray = new int[targetIndex];
		System.arraycopy( array, 0, newArray, 0, targetIndex );
		//System.out.println(Arrays.toString(newArray));
		//System.out.println(Arrays.toString(zero));

		int aLen = newArray.length;
        int bLen = zero.length;
		int[] result = new int[aLen + bLen];

        System.arraycopy(newArray, 0, result, 0, aLen);
        System.arraycopy(zero, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
		
	}
}
