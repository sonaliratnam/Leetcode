class A{
	public static void main(String[] args)
	{
	MainClass a=new MainClass();
	System.out.println("sum of numbers from 1 to 1o is "+a.calculate(1,10));
	}
}


class MainClass{

	public int calculate(int i,int j){
		int a=0;
		if(i<j)//when1<10
		a=calculate(i,j);
		else
		a=j;// when 10=10

		return a;
}
}

