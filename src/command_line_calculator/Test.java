/*
 *  A test class so that the code can be ran on the CLI. 
 *  This class contains the main method.
 */

package command_line_calculator;

public class Test {
	public static void main(String[] args){
		boolean calcOn = true;
		
		// Initializes the program and executes the selected operation on firstNum and nextNum.
		// The answer is stored privately in the RunningCalculations class, in a private variable called currentAnswer.
		Methods.startCalc();
		
		// This application loops endlessly.
		while(calcOn){
			
		// keepGoing() executes the selected operation on currentAnswer and nextNum.	  
	    Methods.keepGoing();	
		}
		
	} // End main method.
} // End Test class.
