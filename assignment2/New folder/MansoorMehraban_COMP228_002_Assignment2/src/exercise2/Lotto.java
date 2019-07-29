package exercise2;

import java.security.SecureRandom;

import javax.swing.JOptionPane;
import java.util.stream.*;


public class Lotto {
	
	int[] arrayLotto = new int[3];;
	int sumOfArrayLotto;
	
	public Lotto() {
		
		SecureRandom randomIntegerValues = new SecureRandom();
			
		arrayLotto[0] = randomIntegerValues.nextInt(10);
		arrayLotto[1] = randomIntegerValues.nextInt(10);
		arrayLotto[2] = randomIntegerValues.nextInt(10);

		
	}
		
	
	public int[] returnArray() {

		 return arrayLotto;
	}
	
	public void numChosenMethod() {
		
		int numChosen = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27 "));
		
		
		if(numChosen >=3 && numChosen <=27) {
			
			returnArray();
			int sumOfArrayLotto = IntStream.of(returnArray()).sum();
			
			if(numChosen == sumOfArrayLotto) {
				JOptionPane.showMessageDialog(null, "The sum of the lotto is " +sumOfArrayLotto+ " You Win ");
			}
			else if(numChosen != sumOfArrayLotto) {
				
				JOptionPane.showMessageDialog(null, "Thats not the right number");
				
				for(int i=0; i<4; i++) {
					numChosen = Integer.parseInt(JOptionPane.showInputDialog("Choose another number between 3 and 27 "));
					
					if(numChosen == sumOfArrayLotto) {
						JOptionPane.showMessageDialog(null, "The sum of the lotto is " +sumOfArrayLotto+ " You Win ");
					}
					else {
						JOptionPane.showMessageDialog(null, "Thats not the right number");
					}
				}
				JOptionPane.showMessageDialog(null, "You Lose! The sum of the array lotto is: " +sumOfArrayLotto+"");
			}
		}
	}
}
