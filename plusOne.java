import java.util.Arrays;
import java.util.Scanner;

public class plusOne {
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
	
		String x="";
		for(int i=0;i<elem;i++) {
			x=x+array[i];
		}
		
		//System.out.println(Integer.parseInt(x));
		
		Long y=Long.parseLong(x);
		
		y=y+1;
		//System.out.println(y);
		String d=String.valueOf(y);
		//System.out.println(d);
		int res[]=new int[d.length()];
		//String res="";
		//System.out.println(y);
		for(int j=0;j<d.length();j++) {
		
		res[j]=Integer.parseInt(String.valueOf(d.charAt(j)));
				//d.charAt(j);
		
		}
		System.out.println(Arrays.toString(res));	
}
}