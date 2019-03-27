
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;


public class BannedWords {
	static HashMap<String, Integer> freq = new HashMap<String, Integer>();
public static void main(String args[])
{	
	
	System.out.println("Enter the paragraph: ");
	
	Scanner paragraph=new Scanner(System.in);
	String scannerElem= paragraph.nextLine();
	
	
	String[] wordsWithSplit = scannerElem.split(" "); 
	
	//To input a list of banned words in an array
	System.out.print("Enter how many words in banned list: ");
	int numOfBannedWords = Integer.parseInt(paragraph.nextLine());
	
	//Create a string array to store the words 
	String arrayOfBannedWords[] = new String[numOfBannedWords];
	for (int i = 0; i < arrayOfBannedWords.length; i++) {
		System.out.print("Enter the banned word " + (i+1) + " : ");
		arrayOfBannedWords[i] = paragraph.nextLine();
	}
	
			
	//System.out.println("output string: " + Arrays.toString(wordsWithSplit));
	
	
	
	for(String s: wordsWithSplit) {
		int prev=0;
		
		//get previous count
		
		if(freq.get(s)!=null)
			prev=freq.get(s);
		
		freq.put(s, prev+1);
	}
	System.out.println(freq);
	//get the first value from the map
	/*Map.Entry<String, Integer> firstEntry = freq.entrySet().iterator().next();
	int largestValue = firstEntry.getValue();
	String largestKey=firstEntry.getKey();
	//System.out.println(largestKey);
	
	for (Map.Entry<String, Integer> map : freq.entrySet())
	{
		int value=map.getValue();
		String keyValue=map.getKey();
	
		if(value>largestValue && isValidword(map.getKey(),arrayOfBannedWords)  ) {
	
			  largestValue=value;
			  largestKey=map.getKey();
			  
			  
								 					}
		System.out.println(largestKey);
			
								 }
													 
	}
		
	

private static boolean isValidword(String key, String[] arrayOfBannedWords) {
	// TODO Auto-generated method stub
	for(int i=0;i< arrayOfBannedWords.length;i++)
	{
		if(key==arrayOfBannedWords[i]) {
			return false;
										}
		
	}
	return true;

}
*/

}
}

