
public class practice {
public static void main(String args[]) {
	int depth=5;
	
	int s=depth,m = 0;
	for(int i=1;i<=depth;i++) {
		m=s;
		while(s>0) {
		System.out.println("");
		s--;
		}
	
	for(int j=1;j<=i;j++) {
		System.out.println("*");
		
	}
	System.out.println("\n");
	s=m-1;
}
}
}
