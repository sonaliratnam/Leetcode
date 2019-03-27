import java.util.Scanner;

public class capital1 {
	public static void main(String args[]) 
	{
		int count=0, count1=0,count2=0;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		char[] c=string.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(Character.isUpperCase(c[i])) {
				count++;
			}
		}
		if(count==c.length) {
			//System.out.println("c1");
			boolean x=true1();
			System.out.println(x);
		}
		
		else if(count<c.length) {
			if(Character.isUpperCase(c[0])) {
				for(int i=1;i<c.length;i++) {
					if(Character.isLowerCase(c[i])) {
						count1++;
					}
				}
			
				if(count1==(c.length-1)) {
					boolean x=true1();
					System.out.println(x);
				}
				 //System.out.println("c4");
				else System.out.println(false);
			}
			else if(Character.isLowerCase(c[0])) {
				for(int i=1;i<c.length;i++) {
					if(Character.isLowerCase(c[i])) {
						count2++;
					}
				}
				if(count2==(c.length-1)) {
					boolean x=true1();
					System.out.println(x);
				}
				//else System.out.println("c4");
				else System.out.println(false);
			}
			
		}
	}

	private static boolean false1() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean true1() {
		return true;
		// TODO Auto-generated method stub
		
	}
}
