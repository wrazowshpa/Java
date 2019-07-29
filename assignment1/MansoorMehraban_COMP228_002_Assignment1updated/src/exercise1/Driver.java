package exercise1;
import java.util.Scanner;
import exercise1.Shirt;
import javax.swing.JOptionPane;
import exercise2.Label;

public class Driver {
	
	/**
	 * Author : Mansoor Mehraban
	 * Description : This class is used to get input from the user and output to the user
	 * 
	 */

	public static void main(String[] args) {
		
		Shirt shirt = new Shirt();
		
		Scanner scanner = new Scanner( System.in );
		String color; 
		char size;
		int ageRange;
		boolean isForMen;
		String createShirt;
		
		System.out.print("Do you want to create a shirt? ");
		createShirt = scanner.nextLine();
		
		/* 
		 * 
		 * This if is created if the user inputs yes and then it will begin the questions to ask the user
		 * 
		 */
		
		
		if(createShirt.equals("yes")){
			
			System.out.print("Please enter the color of the shirt ");
			color = scanner.nextLine();
			System.out.print("Please enter size (s, m, l) ");
			size = scanner.next().charAt(0);
			System.out.print("Please enter the age range of the shirt ");
			ageRange = scanner.nextInt();
			System.out.print("Please enter true if it is for men or false if it is not for men ");
			isForMen = scanner.nextBoolean();
			
			shirt.setColor(color);
			shirt.setSize(size);
			shirt.setAgeRange(ageRange);
			shirt.setisForMen(isForMen);
			
			
			String fabricOfShirt;
			fabricOfShirt = JOptionPane.showInputDialog("What fabrics do you want in the shirt? ");
			
			String caringInstructions;
			caringInstructions = JOptionPane.showInputDialog("What are the caring instructions? ");
			
			Label label = new Label(fabricOfShirt, caringInstructions);	
			
			shirt.setLabel(label);
			
			System.out.println(shirt.getInformation());

			System.exit(0);

		}
		
		/* 
		 * 
		 * This else is to output to the user that the program will not continue 
		 * 
		 */
		else {
			System.out.println("No shirt was created since you chose not to create one");
		}
		
		scanner.close();
		

	}

}
