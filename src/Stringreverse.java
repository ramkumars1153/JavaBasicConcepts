import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Ramkumar";
		
		char[] array = input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : array) 
		{
			list.add(c);
		}
		Collections.reverse(list);
		
		ListIterator<Character> iter = list.listIterator();
		while (iter.hasNext()) 
		{
			System.out.print(iter.next());
		}
		System.out.println();
		System.out.println(input.length());
		
		int number = 0;
		for (char num : array) 
		{
			number++;
		}
		
		System.out.println(number);
		
	}

}
