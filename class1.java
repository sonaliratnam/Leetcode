
public class class1 {


	 public static void main(String args[]){

		int number1=10;
		int number2=20;
		int number3=30;
		int number4=40;
		int result1=sum(number1,number2);
		 result1=sum(result1,number3);
		 result1=sum(result1,number4);
		System.out.println(result1);
		}
	 
		public static int sum(int a,int b){
		return a+b;

		}


		}

