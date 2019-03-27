import java.util.Scanner;

public class anagram {
private static final int SIZE = 2;

public static void main(String args[])
{
	 int[] freq = new int[SIZE];
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	 System.out.println("Enter the first string");
	 String x=sc1.nextLine();
	 System.out.println("Enter the second string");
	 String y=sc2.nextLine();
	char[] array1=x.toCharArray();
	char[] array2=y.toCharArray();
	if(array1.length==array2.length) {
		for(int i=0;i<array1.length;i++) {
			
		}
	}
}
}
