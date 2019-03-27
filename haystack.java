import java.util.Scanner;

public class haystack {
public static void main(String args[]) {
	System.out.println("Enter the haystack");
	Scanner sc=new Scanner(System.in);
	String haystack=sc.nextLine();
	char[] c=haystack.toCharArray();
	
	System.out.println("Enter the needle");
	String needle=sc.nextLine();
	
	for(int i=0;i<haystack.length();i++) {
		//System.out.println(haystack[i]);
	}
}
}
