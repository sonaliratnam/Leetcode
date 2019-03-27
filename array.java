/*
public class array {
	 public static void main (String[] args) {
	String[] arrayname= new String[3];
	arrayname[0]="sonali";
	arrayname[1]="sonali";
	arrayname[2]="sonali";
	 for (int i = 0; i < arrayname.length; i++)
         System.out.println("Element at index " + i +" : "+ arrayname[i]);
}
}
*/

class array
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
 
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
    }
}
