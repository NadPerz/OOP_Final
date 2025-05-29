package final_2023or21_q3;

public class MainApp {

	public static void main(String[] args) {
		
		Pair <String, Integer> p1= new Pair<>("Hey", 11);
		Pair <Double, String> p2= new Pair<>(11.5232, "AD");
		
		System.out.println("First Pair");
		System.out.println("First value:"+p1.getFirst());
		System.out.println("Second value:"+ p1.getSecond());
		
		System.out.println(" ");

		System.out.println("Second Pair");
		System.out.println("First value:"+p2.getFirst());
		System.out.println("Second value:"+ p2.getSecond());
		
	}
}
