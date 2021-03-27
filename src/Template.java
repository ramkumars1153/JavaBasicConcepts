
class Car{
	
	int speed;
	int weight;
	String name;
	
	Car(){
		int speed = 11;
		int weight = 1000;
		String name = "Default Value";
		System.out.println("Default Constructor Is Running");
	}
	
	Car(int i){
		System.out.println(i);
	}
	
	Car(int i, int j){
		System.out.println(i+j+" is the sum of two numbers");
	}
	
	Car(int i, String j){
		String name = j;
		int speed = i;
		System.out.println("The value of i is "+speed);
		System.out.println("The value of j in string is "+name);
	}
	
	public void Run(){
		System.out.println("Dog is running");
	}
	
	public static void Crawl(){
		System.out.println("Dog is crawling");
	}
}


public class Template {

	public static void main(String[] args) 
	{
		Car dog = new Car();
		int i =dog.speed=10;
		System.out.println(i);
		dog.Run();
		Car.Crawl();
		System.out.println(dog.name+" This is dog.name");
		
		Car Shepard = new Car(1,"this is life");
		System.out.println(Shepard.name);
		System.out.println(Shepard.speed);
		Shepard.Run();
		Car.Crawl();
	}

}
