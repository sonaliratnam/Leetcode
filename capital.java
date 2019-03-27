import java.util.Scanner;

public class capital {
	public static void main(String args[]) 
	{
		Boolean upper = null,lower = null;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		char[] c=string.toCharArray();
		
		if(Character.isUpperCase(c[0])){
		upper(c);
	}
		else if(Character.isLowerCase(c[0])) {
			
			for(int i=1;i<c.length;i++) {
				if(Character.isUpperCase(c[i])) {
					System.out.println("xxx");
				}
				

			}
		}
}

	private static boolean upper(char[] c) {
		// TODO Auto-generated method stub
		if(Character.isUpperCase(c[1])) {
			for(int i=2;i<c.length;i++) {
				if(Character.isUpperCase(c[i])) {
					return true ;
				}
			}
	
		}
		else if(Character.isLowerCase(c[1])) {
			for(int i=1;i<c.length;i++) {
				if(Character.isLowerCase(c[i])) {
					return true; 
				}
			}
		}
		return false;
		
	}
}
