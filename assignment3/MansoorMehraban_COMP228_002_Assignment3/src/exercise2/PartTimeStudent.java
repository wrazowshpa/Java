package exercise2;

import java.util.Scanner;

public class PartTimeStudent extends Student {

	@Override
	public void determineTuition() {
		
		double numberOfCreditHours;
		double costOfTuition;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many credit hours");
		numberOfCreditHours = scanner.nextDouble();
		
		costOfTuition = 100*numberOfCreditHours;
		
		System.out.println("Tuition cost is: $"+costOfTuition+"");
		
		scanner.close();
	}

}
