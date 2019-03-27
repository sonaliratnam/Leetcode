import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
public static void main(String args[]) {
	System.out.println("Enter left string");
	Scanner scanL=new Scanner(System.in);
	String left = scanL.nextLine();
	System.out.println(left);
	
	System.out.println("Enter right string");
	Scanner scanR=new Scanner(System.in);
	String right = scanR.nextLine();
	System.out.println(right);
	 isAnagram(left,right);
	char[] x = left.toCharArray();
	char[] y = right.toCharArray();
	//System.out.println(x[0]);
	for(int i=0;i<=left.length();i++)
		for(int j=0;j<=right.length();j++)
		{
			if(x[i]==y[j]) {
			System.out.print("same");	
			}
		}
	
	/*List<String> x = new ArrayList<String>();
	x.add("s");
	x.add("s");
	x.add("s");
	x.add("s");
	System.out.println(x);
	*/
}

private static void isAnagram(String left, String right) {
	// TODO Auto-generated method stub
	
}
}
