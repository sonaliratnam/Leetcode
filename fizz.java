import java.util.Arrays;
import java.util.Scanner;

public class fizz {
public static void main(String args[]) {
	 String conact;
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String[] array=new String[num+1];
	for(int i=1;i<=num;i++) {
		//System.out.println(i);
		if(i%3==0||i%5==0|| i%3==0 && i%5==0) {

if(i%3==0 && i%5!=0) {
	//System.out.println("fizz");
	array[i]="fizz";
	
}
else if (i%5==0 && i%3!=0) {
	//System.out.println("buzz");
	array[i]="buzz";
	//System.out.println(Arrays.toString(array));
}
else if(i%3==0 && i%5==0) {
	//System.out.println("fizzbuzz");
	array[i]="fizzbuzz";
	//System.out.println(Arrays.toString(array));
}
		}
		else
		//	System.out.println(String.valueOf(i));
			array[i]=String.valueOf(i);
		//System.out.println(array.toString());
		}
	//System.out.println(Arrays.toString(array));
	String[] yourArray = Arrays.copyOfRange(array, 1, array.length);
	System.out.println(Arrays.toString(yourArray));
}
}
