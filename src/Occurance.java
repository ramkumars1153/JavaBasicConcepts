import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "in india";
		int occurance = 0;
		Scanner scan = new Scanner(System.in);
		char tofind= scan.next().charAt(0);
		
		char[] array = value.toCharArray();
		
		for(char val:array)
		{
			if (val==tofind) 
			{
				occurance++;
			}
		}
		
		System.out.println(occurance);

	}

}
