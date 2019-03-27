import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class singleNumber1 {
@SuppressWarnings("unlikely-arg-type")
public static void main(String args[]) {
	
	System.out.println("Enter the number of elements:");
	Scanner sc=new Scanner(System.in);
	int elem=sc.nextInt();
	
	 ArrayList<String> list = new ArrayList<String>();
	 
	 
	 System.out.println("Enter the elements:");
	 for(int i =0; i<=elem; i++)
	 {
	  list.add(sc.nextLine());
	 }
	 
	 
	if(elem%2==0) {
		System.out.println("even");
		
	}
	else {
		//System.out.println("odd");
		Set<String> st = new HashSet<String>(list);
		st.remove("");
	for (String s : st) {
	
      //  System.out.println(s + ": " + Collections.frequency(list, s));
	
	if(Collections.frequency(list, s)==1 || Collections.frequency(list, s)==2) {
		if(Collections.frequency(list, s)==1) {
			System.out.println(s);
		}
	}
	else {
		System.out.println("Invalid");
	}
	
	}
	//System.out.println(Arrays.toString(array));
}
}

}