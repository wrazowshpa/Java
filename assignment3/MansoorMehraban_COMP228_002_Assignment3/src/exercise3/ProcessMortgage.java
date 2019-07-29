/**
 * 
 */
package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessMortgage {


	public static void main(String[] args) {
		
		double currentInterestRate;
		String mortgageType;
		int mortgageTerm;
		int mortgageAmount;
		int mortgageNum;
		String customerName;
		
		
		List<Mortgage> mortgage = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the current interest rate");
		currentInterestRate = scanner.nextDouble();
		
		int i = 0;
		
		do{
			
			System.out.println("What is the mortgage type");
			mortgageType = scanner.next();

			if(mortgageType.equalsIgnoreCase("business")) {
				
				System.out.println("What is the mortgage number");
				mortgageNum = scanner.nextInt();
				
				System.out.println("What is the customer name");
				customerName = scanner.next();
				
				System.out.println("What is the mortgage term");
				mortgageTerm = scanner.nextInt();
				
				
				System.out.println("What is the mortgage amount");
				mortgageAmount = scanner.nextInt();
				
				BusinessMortgage businessMortgage = new BusinessMortgage();
				businessMortgage.setTerm(mortgageTerm);
				businessMortgage.setAmountOfMortgage(mortgageAmount);
				businessMortgage.setMortgageNum(mortgageNum);
				businessMortgage.setCustomerName(customerName);
				businessMortgage.setInterestRate(currentInterestRate);
				mortgage.add(businessMortgage);
				

				
			}
			else if(mortgageType.equalsIgnoreCase("personal")) {
				
				System.out.println("What is the mortgage number");
				mortgageNum = scanner.nextInt();
				
				System.out.println("What is the customer name");
				customerName = scanner.next();
				
				System.out.println("What is the mortgage term");
				mortgageTerm = scanner.nextInt();
				
				System.out.println("What is the mortgage amount");
				mortgageAmount = scanner.nextInt();
				
				PersonalMortgage personalMortgage = new PersonalMortgage();
				personalMortgage.setTerm(mortgageTerm);
				personalMortgage.setAmountOfMortgage(mortgageAmount);
				personalMortgage.setMortgageNum(mortgageNum);
				personalMortgage.setCustomerName(customerName);
				personalMortgage.setInterestRate(currentInterestRate);
				mortgage.add(personalMortgage);
			}
			i++;
		}while(i<3);
			
			ProcessMortgage processMortgage = new ProcessMortgage();
			processMortgage.listOfMortgages(mortgage);
			
			scanner.close();
	}
		public void listOfMortgages(List<Mortgage> mortgage) {
			
			for(Mortgage m : mortgage) {
				System.out.println(m.getMortgageInfo());
			}
		}
		
}
