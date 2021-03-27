
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ramkumar sureshkumar@accenture com";
		String[] b = a.split(" ");
		
		String reversed = "";
		
		for (String temp : b) 
		{
			String rev = "";
			for (int i = temp.length()-1; i >=0; i--) 
			{
				rev=rev+temp.charAt(i);
			}
			reversed = reversed+rev+" ";
		}
		
		System.out.println(reversed);
	}

}
