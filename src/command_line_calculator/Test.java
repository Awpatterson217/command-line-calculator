/*
 *  A test class so that the code can be ran on the CLI. 
 *  This class contains the main method.
 */

package command_line_calculator;

public class Test {
	public static void main(String[] args){
		int counter = 0;
		
		// Initializes the program and executes the the selected operation on firstNum and nextNum.
		// The answer is stored privately in the RunningCalculations class, in a private variable called currentAnswer.
		Methods.startCalc();
		
		// This application is currently set to handle up to 10 numbers.
		while(counter <= 10){
			
		// The keepGoing method executes the selected operation on the values of currentAnswer and nextNum.	
		// This method loops continuously until the user either enters CTRL-C, or counter = 10.  
	    Methods.keepGoing();
		counter++;
		
		} // End while loop.
	} // End main method.
} // End Test class.
