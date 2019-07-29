package exercise3;

public class Java {
	
//
//Write a Java class that implements a set of three overloaded static methods. 
//The methods should have different set of parameters and perform similar functionalities. 
//Call the methods within main method and display the results.

	public Java() {
		
	}
	
	public void overload(int a, int b) {
		int sum = a+b;
		System.out.printf("this is the sum %s", sum);
	}
	public void overload(int a, int b, int c) {
		int result = a+b*c;
		System.out.printf("this is the resul %s", result);
	}
	public void overload(int a, int b, int c, int d) {
		int result = a+b*c-d;
		System.out.printf("this is the sum %s", result);
	}

}
