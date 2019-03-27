import java.util.Scanner;

public class findTheDifference {
public static void main(String args[]) {
	
	 String strA = "cbdad";
     String strB = "cbdadq";
     System.out.println(findExtraCharcter(strA, strB));
     
	

}

private static char findExtraCharcter(String strA, String strB) {
	// TODO Auto-generated method stub
int res = 0, i;
    
    // traverse string A till 
    // end and xor with res
    for (i = 0; i < strA.length(); i++)
    {
        // xor with res
        res ^= strA.charAt(i);
    }
    System.out.println(res);
 
    // traverse string B till end and 
    // xor with res
    for (i = 0; i < strB.length(); i++)
    {
        // xor with res
        res ^= strB.charAt(i);
    }
    System.out.println(res);
    // print result at the end
    return ((char)(res));
}
}

