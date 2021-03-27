
public class ExtractNumberinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "Ramkumar1153";
		
		int total = 0;
		
		char[] array = value.toCharArray();
		
		for (char separate : array) {
			
			if (Character.isDigit(separate)) 
			{
				int number =Character.getNumericValue(separate);
				total = total+number;
			}
		}
		System.out.println(total);
	}

}
