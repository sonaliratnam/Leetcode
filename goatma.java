import java.util.Scanner;

public class goatma {

public static void main(String args[]) {
	char[] c = null;
	String s[]=null;
	String y=null;
	boolean contains = false;
	String c1=null;
	int index=0;
	
	System.out.println("Enter the sentence");
	Scanner sc=new Scanner(System.in);
	String num=sc.nextLine();
	//System.out.println("The sentence is:"+num);
	
	String [] arrOfStr = num.split(" ");
	
	 for (String a : arrOfStr) {
         //System.out.println(a);
		 contains =false;
		 char[] arrayofvowels= {'a','e','i','o','u','A','E','I','O','U'};
			// System.out.println(a.charAt(0));
			 for(int j=0;j<arrayofvowels.length;j++) {
			 if(a.charAt(0)==arrayofvowels[j]) {
	    		  a=a+"ma";
	    		  contains=true ;
	    		  break;
			 }
			 }
		 if((contains==false) ){
			 a.substring(1);;
				// System.out.println("abc");
				 String s1=a.substring(1);
				  a=s1+"ma";
				  System.out.println(a);
			 }
		 
		 index++;
		 //System.out.println(index);
	 String x= addinga(index);
	  y=a+x;
			//System.out.println(y);
			// System.out.println(x);
			 
//Ranjith modify below lines
	  //join(y,arrOfStr); 
			 a=y;
	 }
	//Ranjith added below function
join(arrOfStr);
	     
	 
}

private static void join(String[] arrOfStr) {
	// TODO Auto-generated method stub
	String sentence="";
	
	//System.out.println(arrOfStr.length);
	for(int i=0;i<arrOfStr.length;i++) {
		sentence=sentence+" "+arrOfStr[i]+addinga(i);


	}
	
	System.out.println(sentence);
	
}

private static String addinga(int index) {
	// TODO Auto-generated method stub
	
String xyz="";
/*if(index==1) {
	a=a+"a";
}
System.out.println(a);
}
*/
	
	for(int i=0;i<index;i++) {
		xyz=xyz+"a";
	}
	return xyz;
}


}