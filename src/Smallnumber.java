import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Smallnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] allnumber = {3,4,5,2,1,4,6,7};
		
		int smallnumber = Integer.MAX_VALUE;
		
		for (int i = 0; i < allnumber.length; i++) 
		{
			if (smallnumber>allnumber[i]) 
			{
				smallnumber=allnumber[i];
			}
		}
		System.out.println(smallnumber);
		
		Arrays.sort(allnumber);
		
		System.out.println(allnumber[0]);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer integer : allnumber) 
		{
			list.add(integer);
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));

	}

}
