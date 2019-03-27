import java.util.Scanner;

public class repeatedStringMatch {
public static void main(String args[]) {
	System.out.println("Enter the string A");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	System.out.println("Enter the string B");
	String b=sc.nextLine();
	int count=0;
	int m=a.length();
	//code for comparing the two strings
	for(int i=0;i<b.length();i++) {
		for(int j=0;j<a.length();j++) {
			if(b.charAt(i)==a.charAt(m)) {
			   //increment the count only if the character in B matches the character in A
				count++;
			}
		}
	}
	
	System.out.println(count);
}
}
