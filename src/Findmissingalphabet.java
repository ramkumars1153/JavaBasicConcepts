import java.util.HashSet;

public class Findmissingalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given = "If zombies rule your world quickly tell judge patrick";
		
		given = given.replaceAll(" ", "");
		given = given.toLowerCase();
		
		String[] givenarray = given.split("");
		String[] alphaarray = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> list1 = new HashSet<String>();
		
		for (String string : givenarray) {
			list1.add(string);
		}

		HashSet<String> list2 = new HashSet<String>();
		
		for (String string : alphaarray) {
			list2.add(string);
		}
		
		System.out.println(list1);
//		list2.removeAll(list1);
		
		System.out.println(list2);
		
	}

}
