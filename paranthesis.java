import java.util.Scanner;

public class paranthesis {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int count=0,incr1=0,incr2=0,incr3=0;
    
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='{'|| s.charAt(i)=='}'||s.charAt(i)==')'|| s.charAt(i)=='('||s.charAt(i)=='['|| s.charAt(i)==']') {
		//System.out.print("It is a valid cahracter");
		count++;
	}
	else count=0;
}
if ( count==s.length()){

	if(s.charAt(0)=='(') {
		
		bracket1(s,incr1,incr2);
	}
	else if(s.charAt(0)=='[') {
		bracket2();
	}
	else if(s.charAt(0)=='{') {
		bracket3();
	}
}
else {
	System.out.println("Michhoso");
}
}

private static void bracket2() {
	// TODO Auto-generated method stub
	
}
private static void bracket3() {
	// TODO Auto-generated method stub
	
}

private static void bracket1(String s, int incr1, int incr2) {
	// TODO Auto-generated method stub
	 for(int i=s.length()-1;i<1;i++) {
		 if(s.charAt(i)==')') {
			 incr1=0;
			incr1=incr1+1;;
			System.out.print(incr1);
		 }
	 }
	 for(int i=1;i<s.length();i++) {
		 if ((s.charAt(i)=='[')||(s.charAt(i)=='{')|| (s.charAt(i)=='(')){
			 if(s.charAt(i)=='[') {
			for(i=i+1;i<s.length();i++) {
				if(s.charAt(i)==']') {
					incr2=0;
					incr2++;
				}
			}
			 }
			 
		 }
	 }
	 
		 // System.out.println(incr1);
	 System.out.println(incr2);
}
}