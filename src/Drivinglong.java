class AllDayLong{
	
	static String i;
	
	public AllDayLong() {
		System.out.println("This is a constructor");
	}
	static void Longnight() {
		System.out.println(i);
	}
	
}

public class Drivinglong {

	public static void main(String[] args) {
		AllDayLong all = new AllDayLong();
		all.Longnight();
		
		AllDayLong.Longnight();
	}

}
