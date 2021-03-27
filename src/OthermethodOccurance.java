import java.util.Scanner;

public class OthermethodOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "Ram is a good guy living in india";
		int occurance = 0;
		Scanner scan = new Scanner(System.in);
		char tofind= scan.next().charAt(0);
		
		String uniform = value.toLowerCase();
		int before = uniform.length();
		
		String newform = uniform.replace(Character.toString(tofind),"");
		int after = newform.length();
		
		System.out.println(before-after);
		
		
	}

}
