
public class Replaceall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "Ram is a good guy living in india";
		
		String replace = value.replaceAll("[AEIOUaeiou]", "*");
		
		System.out.println(replace);
		
		char[] array = value.toCharArray();
		String finalword="";
		for (char parti : array) 
		{
			if (parti=='a' || parti=='e' || parti=='i' || parti=='o' || parti=='u') 
			{
				parti='*';
			}
			finalword = finalword+parti;
		}
		
		System.out.println(finalword);
		
	}

}
