
public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "welcome to cognizant";
		
		String b = a.substring(a.lastIndexOf("o")+1);
		System.out.println(b.trim());
		String[] tempy = a.split(" ");
		String reversed="";
		String forrev = "";
		
		for (String string : tempy)
		{
			String rev="";
			for(int j=string.length()-1;j>=0;j--)
			{
				rev=rev+string.charAt(j);
			}
			reversed = reversed+rev+" ";
		}
		
		for(int i=0;i<tempy.length;i++)
		{
			String value = tempy[i];
			String rev="";
			
			for(int j=value.length()-1;j>=0;j--)
			{
				rev=rev+value.charAt(j);
			}
			forrev = forrev+rev+" ";
		}
		
		System.out.println(forrev.trim());
		System.out.println(reversed.trim());

	}

}
