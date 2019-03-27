import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class shortestToChar {
public static void main(String args[]) {
	System.out.println("Enter the sentence");
	Scanner sc=new Scanner(System.in);
	String num=sc.nextLine();
	char[] x=num.toCharArray();
	 int[] array1=new int[num.length()];
	//System.out.println(new String(num).indexOf("e")); 
	
	//System.out.println(num);
	
	List<Integer> list = new ArrayList<Integer> ();
	char c='e';
	/*System.out.println("Enter the character");
	c=sc.nextLine();
	*/
	for (int i = 0; i < x.length; i++) {
		if(c==x[i]) {
			list.add(i);
		}
	}
	System.out.println(list);
	boolean init=true;
	int temp=0;
	int fg=0;
	//init=true;
	
	int[][] array=new int[list.size()][num.length()];
	int row=0;
	for(int num1:list) {
		
		for(int j=0;j<x.length;j++) {
			//count++;
			array[row][j]=Math.abs(j-num1);
			//System.out.print( Math.abs(j-num1));
			//System.out.print(array[row][j]);
			
			
		/*if(init) {
			if(j<=num1) {
				System.out.print( Math.abs(j-num1));
			}
			else {
			temp=num1;
			init=false;
			//System.out.print("s");
			break;
			
			}
		}
		else
		{
			//System.out.println("so"+temp);
			
			if( j>temp &&j<=num1) {
				System.out.println(j + " " +num1);
			//	System.out.print( Math.abs(j-num1));
				
				//System.out.println(j);
			}
			else if(j>num1)  {
				temp=num1;
				break;
			}
		}
		}
		//[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
		//l o v e l e e t c o d e 
		
			}
			*/
	
		}
		row++;
		//System.out.println("");
	}
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[i].length;j++) {
			//System.out.print(array[i][j]);
		}
		//System.out.println("");
	}
	int min=0;
	for(int i=0;i<array[0].length;i++) {
        boolean initail=true;
        
        for(int j=0;j<array.length;j++) {
            //System.out.print(array[j][i]);
            if(initail){
                min=array[j][i];
                initail=false;
            }else{
                if(min>array[j][i]){
                    min=array[j][i];
                }
            }
        }
      
       System.out.print(min);

      
       // List<Integer> digits = new ArrayList<Integer>();
       
        
                }
	

	
	
        }
}



