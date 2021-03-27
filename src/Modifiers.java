
class Ram{
	public void Add() 
	{
		System.out.println("Add method");
	}
	
	public static void Addition(int a, int b) 
	{
		System.out.println(a+b);
	}
}

public class Modifiers {

	public static void main(String[] args) 
	{
		System.out.println("God is great");
		methodOne();
		Ram adding = new Ram();
		adding.Add();
		Ram.Addition(2, 3);
	}
	
	private static void methodOne() 
	{
		System.out.println("Ram Loves God Siva");
	}

}
