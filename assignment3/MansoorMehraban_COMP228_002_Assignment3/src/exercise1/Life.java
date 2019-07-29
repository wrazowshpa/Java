package exercise1;

import java.util.Scanner;

public class Life extends Insurance {
	
	public Life () {
		
	}
	
	
	@Override
	public void setInsuranceCost() {
		int age;
		int yearsOfInsuranceNeeded;
		double currentIncome;
		double percentOfIncomeNeeded;
		double costOfLifeInsurancePerMonth;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you");
		age = scanner.nextInt();
		
		System.out.println("Current income (after taxes)");
		currentIncome = scanner.nextInt();
		
		System.out.println("Percentage of income your family will need");
		percentOfIncomeNeeded = scanner.nextInt();
		
		System.out.println("How long your family will need financial support");
		yearsOfInsuranceNeeded = scanner.nextInt();
		
		costOfLifeInsurancePerMonth = age * currentIncome * percentOfIncomeNeeded / yearsOfInsuranceNeeded / 12;
		System.out.println("Your cost of insurance per month will be $"+costOfLifeInsurancePerMonth+"");
		
		scanner.close();
	}

	@Override
	public void displayInfo() {
		
		System.out.println("Insurance Type: Life Insurance");
		
	}

}
