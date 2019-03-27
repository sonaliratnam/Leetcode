import java.util.Scanner;

public class hamming {
public static void main(String args[]) {
	int count=0;
	String updated1 = null;
	
	System.out.println("Enter the first number");
	Scanner sc1=new Scanner(System.in);
	int x=sc1.nextInt();
	 String digit1= Integer.toBinaryString(x);
		System.out.println(digit1);
	System.out.println("Enter the second number");
	Scanner sc2=new Scanner(System.in);
	int y=sc2.nextInt();
	 String digit2= Integer.toBinaryString(y);
		System.out.println(digit2);
		 if(digit1.length()<digit2.length()) {
			 int len=digit2.length()-digit1.length();
			updated1=zeroes(len)+digit1;
			System.out.println(updated1);
			count=func1(updated1,digit2);
		 }
		 else
		 {
			 int len=digit1.length()-digit2.length();
				updated1=zeroes(len)+digit2;
				System.out.println(updated1);//3
				 count=func2(updated1,digit1);
		 }
		 
		/*char[] char1= digit1.toCharArray();
		char[] char2= digit2.toCharArray();
		System.out.println(char1);
		System.out.println(char2);
		*/
		 

		System.out.println(count);
}

private static int func1(String updated1,String digit2) {
	// TODO Auto-generated method stub
	int c=0;
	for(int i=0;i<updated1.length();i++) { //i<2 since index starts from 0
		if(updated1.charAt(i) != digit2.charAt(i)) //
			c++;
	}
	return c;
}
private static int func2(String updated1,String digit1) {
	// TODO Auto-generated method stub
	int c=0;
	for(int i=0;i<updated1.length();i++) { //i<2 since index starts from 0
		if(updated1.charAt(i) != digit1.charAt(i)) //
			c++;
	}
	return c;
}

private static String zeroes(int len) {
	// TODO Auto-generated method stub
      String zero="";
	for(int i=0;i<len;i++) {
		 zero=zero+0;
		
	}
	// System.out.println(zero);
	return zero;
}
}
