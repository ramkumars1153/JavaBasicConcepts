import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int reverse =0;
		
		while(number!=0)
		{
			reverse=reverse*10;
			reverse=reverse+(number%10);
			number=number/10;
		}
		
		System.out.println(reverse);

	}

}
