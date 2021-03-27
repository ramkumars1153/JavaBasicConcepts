class This{
	
	int number1;
	
	This(int number1) {
		this.number1=number1;
	}
}


public class Main {

	public static void main(String[] args) {
		This num = new This(398);
		System.out.println(num.number1);

	}

}
