package exercise1;

import java.util.Scanner;

public class Health extends Insurance {
	
	public Health() {
		
	}
	

	@Override
	public void setInsuranceCost() {
		
		
		int age;
		int income;
		int numFamilyMembers;
		int yearsOfHealthInsurance;
		double costOfHealthInsurancePerMonth;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your age");
		age = scanner.nextInt();
		
		System.out.println("How many years do you want health insurance for");
		yearsOfHealthInsurance = scanner.nextInt();
		
		System.out.println("What is your income (befor taxes)");
		income = scanner.nextInt();
		
		System.out.println("How many family members do you wish to enroll");
		numFamilyMembers = scanner.nextInt();
		
		costOfHealthInsurancePerMonth = age * income * numFamilyMembers / yearsOfHealthInsurance / 12 * 1.25;
		System.out.println("Cost of health insurance per month $"+costOfHealthInsurancePerMonth+"");
		
		scanner.close();
	}

	@Override
	public void displayInfo() {
		
		System.out.println("Insurance Type: Health Insurance");
	}
}
