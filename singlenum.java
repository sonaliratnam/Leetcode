import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class singlenum {
	public static void main(String args[]) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int elem=sc.nextInt();
		
		
		int array[]=new int[elem];

		int count=0;
		System.out.println("Enter all the elements:");
		for(int i=0;i<elem;i++) {
			array[i]=sc.nextInt();
		}
		
		Map<Integer,Integer> frequencyMap = findFrequency(array);
		
		System.out.println("Frequency of elements :");
		printMap(frequencyMap);
			
		}

	private static void printMap(Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
Iterator<Integer> iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			Integer key = iterator.next();
			
			if(key!=null) {
				if(map.get(key)==1) {
			System.out.println(key );
				}
			}
			
		}
	}

	private static Map<Integer, Integer> findFrequency(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		for (int i : array) {
			// Get value
			Integer val = map.get(i);
			// If value exists
			if (val != null) {
				map.put(i, val + 1);
			} else {
				map.put(i, 1);
			}
		}
		return map;
	}

	}


		
		
		
		
		
	

