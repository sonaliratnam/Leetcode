import java.util.Arrays;
import java.util.Scanner;

public class arraypartition {
public static void main(String args[]) {
	int max,min=0;
	Scanner scan = new Scanner(System.in);
	Scanner s=new Scanner(System.in);

    System.out.println("enter number of elements");

    int n=s.nextInt();

    int arr[]=new int[n];

    System.out.println("enter elements");

    for(int i=0;i<n;i++){//for reading array
        arr[i]=s.nextInt();

    }

    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++) {
    	
    }
	
	}
}

