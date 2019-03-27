import java.util.Scanner;

public class binary {
public static void main(String args[]) {
	System.out.println("Enetr the decimal number");
	Scanner sc=new Scanner(System.in);
	int decimal = sc.nextInt();
  String x = Integer.toBinaryString(decimal);
	System.out.println(x);
	char[] y= x.toCharArray();
	
	//System.out.print(y[0]);
	//System.out.println(y.length);
	for(int i=0;i<y.length;i++) {
		//System.out.print(y[i]);
		if(y[i]=='1') y[i]='0';
		else if(y[i]=='0') y[i]='1';	 	
}
	 System.out.println(y);
	   	String d=String.valueOf(y);
	   	System.out.println(Integer.parseInt(d,2));
}
}
