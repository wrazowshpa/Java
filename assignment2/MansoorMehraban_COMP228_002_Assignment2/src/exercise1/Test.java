package exercise1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.security.SecureRandom;


public class Test {
	
	ArrayList<String> arraySimulateQuestions;
	ArrayList<String> arrayRandomCongrats;
	ArrayList<String> arrayRandomIncorrectMessage;

//	public String question;
//	public String answer;
//	public String message;
//	public String inputAnswer; 
	
	private int answerFirstQuestion;
	private int answerSecondQuestion;
	private int answerThirdQuestion;
	private int answerFourthQuestion;
	private int answerFifthQuestion;
    
    private double numOfCorrectAnswers = 0;
	private double numOfIncorrectAnswers = 0;
	private double averageOfCorrectAnswers;
	
	public Test() {
		
	}
	
	public ArrayList<String> simulateQuestions() {

		arraySimulateQuestions = new ArrayList<String>();
			arraySimulateQuestions.add("A process that involves recognizing and focusing on the important characteristics of a situation or object is known as: ");
			arraySimulateQuestions.add("Which statement is true regarding an object? ");
			arraySimulateQuestions.add("In object-oriented programming, new classes can be defined by extending existing classes. This is an example of: ");
			arraySimulateQuestions.add("Object-oriented inheritance models the ");
			arraySimulateQuestions.add("The wrapping up of data and functions into a single unit is called ");
			
			return arraySimulateQuestions;			
			}
	
	public void inputAnswer() {
		
		String beginTest = JOptionPane.showInputDialog("Do you want to start the test, type yes to begin");
		if (beginTest.equalsIgnoreCase("yes")) {
			
		int i = 0;
		do{
			if(simulateQuestions().get(i).equals(arraySimulateQuestions.get(0))) {
				
				 String[] optionsForQuestionOne = {"Encapsulation", "Polymorphism", "Abstraction", "Inheritance"};
			    answerFirstQuestion = JOptionPane.showOptionDialog(null, arraySimulateQuestions.get(0),
			                "Click a button",
			                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsForQuestionOne, optionsForQuestionOne[0]);
			    
			    checkAnswer(arraySimulateQuestions.get(0), answerFirstQuestion);
			        
			}
			else if(simulateQuestions().get(i).equals(arraySimulateQuestions.get(1))) {
				
				 String[] optionsForQuestionTwo = {"An object is what classes instantiated are from", "An object is an instance of a class",
			        		"An object is a variable", "An object is a reference to an attribute"};
			    answerSecondQuestion = JOptionPane.showOptionDialog(null, arraySimulateQuestions.get(1),
			                "Click a button",
			                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsForQuestionTwo, optionsForQuestionTwo[0]);
			    
			    checkAnswer(arraySimulateQuestions.get(1), answerSecondQuestion);
				
			}
			else if(simulateQuestions().get(i).equals(arraySimulateQuestions.get(2))) {
				 
		        String[] optionsForQuestionThree = {"Encapsulation", "Interface", "Composition", "Inheritance"};
		        answerThirdQuestion = JOptionPane.showOptionDialog(null, arraySimulateQuestions.get(2),
		                "Click a button",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsForQuestionThree, optionsForQuestionThree[0]);
		        
		        checkAnswer(arraySimulateQuestions.get(2), answerThirdQuestion);
				
			}
			else if(simulateQuestions().get(i).equals(arraySimulateQuestions.get(3))) {
				
		        String[] optionsForQuestionFour = {"“is a kind of” relationship","“has a” relationship", "“want to be” relationship", 
		        		"inheritance does not describe any kind of relationship between classes"};
		        answerFourthQuestion = JOptionPane.showOptionDialog(null, arraySimulateQuestions.get(3),
		                "Click a button",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsForQuestionFour, optionsForQuestionFour[0]);
		        
		        checkAnswer(arraySimulateQuestions.get(3), answerFourthQuestion);
				
			}
			else if(simulateQuestions().get(i).equals(arraySimulateQuestions.get(4))) {
				
				String[] optionsForQuestionFive = {"Encapsulation", "Abstraction", "Data Hiding", "Polymorphism"};
		        answerFifthQuestion = JOptionPane.showOptionDialog(null, arraySimulateQuestions.get(4),
		                "Click a button",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsForQuestionFive, optionsForQuestionFive[0]);
		        
		        checkAnswer(arraySimulateQuestions.get(4), answerFifthQuestion);
				
			}
			
			i++;
			
		}while(i<5);
		
		JOptionPane.showMessageDialog(null, "Number of correct answers are: "+ numOfCorrectAnswers +"\nNumber of incorrect answers are: "+ numOfIncorrectAnswers+"\nYour average is: "+averageOfCorrectAnswers+"%");
		System.out.println("Number of correct answers are: "+ numOfCorrectAnswers +"\nNumber of incorrect answers are: "+ numOfIncorrectAnswers+"\nYour average is: "+averageOfCorrectAnswers+"%");
		}
	        	        
	}
	
	public void checkAnswer(String question, int answer) {
		
		
		if(question.equals(arraySimulateQuestions.get(0)) && answer == 2) {
			numOfCorrectAnswers++;
			generateMessage("Correct");
		}
		else if(question.equals(arraySimulateQuestions.get(1)) && answer == 1) {
			numOfCorrectAnswers++;
			generateMessage("Correct");
		}
		else if(question.equals(arraySimulateQuestions.get(2)) && answer == 3) {
			numOfCorrectAnswers++;
			generateMessage("Correct");
		}
		else if(question.equals(arraySimulateQuestions.get(3)) && answer == 0) {
			numOfCorrectAnswers++;
			generateMessage("Correct");
		}
		else if(question.equals(arraySimulateQuestions.get(4)) && answer == 0) {
			numOfCorrectAnswers++;
			generateMessage("Correct");
		}
		else {
			numOfIncorrectAnswers++;
			generateMessage("Incorrect");
			}	
		
		averageOfCorrectAnswers = numOfCorrectAnswers/5 * 100;
		
	}
	
	public void generateMessage(String result) {
		SecureRandom randomCongratsSelection = new SecureRandom();
		String randomCongrats = null;
		int randomCongratsIndex;
		
		SecureRandom randomIncorrectMessageSelection = new SecureRandom();
		String randomIncorrectMessage = null;
		int randomIncorrectMessageIndex;
		
		arrayRandomCongrats = new ArrayList<String>();
		arrayRandomCongrats.add("Excellent! ");
		arrayRandomCongrats.add("Good! ");
		arrayRandomCongrats.add("Keep up the good work! ");
		arrayRandomCongrats.add("Nice work! ");
		
		arrayRandomIncorrectMessage = new ArrayList<String>();
		arrayRandomIncorrectMessage.add("No. Please try again");
		arrayRandomIncorrectMessage.add("Wrong. Try once more");
		arrayRandomIncorrectMessage.add("Don't give up!");
		arrayRandomIncorrectMessage.add("No. Keep trying");
		
		for(int i=0; i<4 ; i++) {
			randomCongratsIndex = randomCongratsSelection.nextInt(arrayRandomCongrats.size());
			randomCongrats = arrayRandomCongrats.get(randomCongratsIndex);
		}
		
		for(int i=0; i<4 ; i++) {
			randomIncorrectMessageIndex = randomIncorrectMessageSelection.nextInt(arrayRandomIncorrectMessage.size());
			randomIncorrectMessage = arrayRandomIncorrectMessage.get(randomIncorrectMessageIndex);
		}

	      switch(result) {
	         case "Correct" :
	            System.out.println(randomCongrats); 
	            break;
	         case "Incorrect":
	            System.out.println(randomIncorrectMessage);
	            break;
	      }
		
	}
}

	