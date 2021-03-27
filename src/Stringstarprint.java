import java.util.Scanner;

public class Stringstarprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row, column;
		int startnumber = 1;
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int numberofline = scan.nextInt();
		
		for(row=0;row<numberofline;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(startnumber+" ");
				startnumber++;
			}
			System.out.println();
		}

	}

}
