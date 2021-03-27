
public class Numberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9};

		boolean val = true;
		int find = 71;
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i]==find) 
			{
				System.out.println("Number present inside the array");
				val=true;
			}
			else 
			{
				val=false;
			}
		}
		
		if (val) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not present");
		}
		
	}

}
