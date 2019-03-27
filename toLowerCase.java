import java.util.Scanner;

public class toLowerCase {
	public static void main(String args[]) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String elem=sc.nextLine();
		
		//System.out.println(elem);
		
		boolean hasUppercase = !elem.equals(elem.toLowerCase());
		System.out.println(hasUppercase);
	}
}
