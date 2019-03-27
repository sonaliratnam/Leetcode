import java.util.Scanner;

public class reverseVowels {
	public static void main(String args[]) {
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		char temp=0;
		char[] x=num.toCharArray();		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u') {
				temp=x[x.length-1];
				x[x.length-1]=x[i];
				x[i]=temp;
				
		}
		}
		System.out.print(String.valueOf(x));
		
	

}
}