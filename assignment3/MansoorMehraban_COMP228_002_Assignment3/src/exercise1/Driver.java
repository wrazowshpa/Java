/**
 * 
 */
package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		List<Insurance> insurance = new ArrayList<>();
		
		String lifeOrHealth;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is type of insurance are you looking for? (health or life)");
		lifeOrHealth = scanner.nextLine();
		
		if(lifeOrHealth.equalsIgnoreCase("health")) {
			Health health = new Health();
			health.setInsuranceCost();;
			health.displayInfo();
			
			insurance.add(health);
		}
		else if(lifeOrHealth.equalsIgnoreCase("life")) {
			Life life = new Life();
			life.setInsuranceCost();
			life.displayInfo();
			
			insurance.add(life);
		}

		for(Insurance a : insurance) {
			a.getMonthlyCost();
		}
		
		scanner.close();

	}

}
