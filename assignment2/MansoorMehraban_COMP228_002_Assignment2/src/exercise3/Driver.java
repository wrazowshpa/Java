package exercise3;

public class Driver {

	public static void main(String[] args) {
		
		Java java = new Java();
		
		java.overload(10, 11);
		System.out.println();
		java.overload(10, 20, 30);
		System.out.println();
		java.overload(10, 20, 30, 23);
		
	}

}
