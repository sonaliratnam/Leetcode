import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selfdiv {
	public static void main(String args[]) {
		System.out.println("Enter the left limit");
		Scanner scanL=new Scanner(System.in);
		int left = scanL.nextInt();

		System.out.println(left);

		System.out.println("Enter the right limit");
		Scanner scanR=new Scanner(System.in);
		int right = scanR.nextInt();
		System.out.println(right);
		List<Integer> m=selfDividingNumbers(left,right);
		System.out.print(m);
	 }

	private static  List<Integer> selfDividingNumbers(int left, int right) {
		// TODO Auto-generated method stub
		List<Integer> x = new ArrayList<Integer>();
		for(int i=left;i<=right;i++) {
			
			if (IsSelfDividingNumber(i))
				x.add(i);
		
			}
		return x;
	}

	private static boolean IsSelfDividingNumber(int i) {
		// TODO Auto-generated method stub
		int temp=i;
		while(temp>0) {
		int d= temp%10;
		if(d==0||i%d!=0)
			return false;
		temp=temp/10;
	}
		return true;
}
}
