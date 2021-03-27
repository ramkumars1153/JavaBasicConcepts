import java.lang.reflect.Array;
import java.util.Scanner;

public class Positionofalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASCII a 97 A 65
		
		Scanner scan = new Scanner(System.in);
		char given = scan.next().charAt(0);
		
		Character.toUpperCase(given);
		
		int number =(int) given;
		int position;
		position=number-64;
		System.out.println(position);
	}

}
