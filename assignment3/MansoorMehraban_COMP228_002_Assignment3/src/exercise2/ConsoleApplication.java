/**
 * 
 */
package exercise2;

import java.util.Scanner;

public class ConsoleApplication {

	public static void main(String[] args) {
		
		String studentType;
		
		Scanner scanner = new Scanner(System.in);
		
		FullTimeStudent fullTimeStudent = new FullTimeStudent();
		PartTimeStudent partTimeStudent = new PartTimeStudent();
		
		System.out.println("Are you a fulltime student or parttime");
		studentType = scanner.nextLine();
		
		if(studentType.equalsIgnoreCase("fulltime")) {
			fullTimeStudent.determineTuition();
		}
		else if(studentType.equalsIgnoreCase("parttime")) {
			partTimeStudent.determineTuition();
		}
		
		scanner.close();
	}
	

}
