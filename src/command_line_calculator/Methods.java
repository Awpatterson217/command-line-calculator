/*
 *  The Methods class contains the startCalc method, and the keepGoing method. These methods are static.
 *  Currently these methods are executed in the main method in the Test class, but
 *  these methods could easily be manipulated to use in a GUI.
 */

package command_line_calculator;

import java.util.Scanner;

public class Methods {
	
	// The startCalc method is the first method executed.
	static void startCalc(){
		
		// An instance of the RunningCalculation class.
		RunningCalculations runningAnswer = new RunningCalculations();
		Scanner userInput = new Scanner(System.in);
		
		// A simple menu which presents the user with a key, each operator is associated with a number.
		// More operators can be added.
		System.out.println("Operators");
		System.out.println("1: Plus");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.print("\n");
		
		// Captures the first number. 
		System.out.println("First number: ");
		double num1 = userInput.nextDouble();
		System.out.print("\n");

		// Captures the operation the user wishes to perform.
		System.out.println("Operator: ");
		int operator1 = userInput.nextInt();
		System.out.print("\n");

		// Captures the second number.
		System.out.println("Second number: ");
		double num2 = userInput.nextDouble();
		System.out.print("\n");
		
		// Executes the firstCalc method. This method takes values in the same order captured. 
		runningAnswer.firstCalc(num1, operator1, num2);
		System.out.print("Current answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		
		userInput.close();
	} // End startCalc.
	
	// The keepGoing method is the second and last method executed.
	// This method can be looped endlessly.
	static void keepGoing(){
		Scanner userInput = new Scanner(System.in);
		
		// Creates an instance of the RunningCalculations class.
		RunningCalculations runningAnswer = new RunningCalculations();
		
		// Allows the user to perform another operation on a new number(nextNum) and currentAnswer.
		System.out.println("Next operator: ");
		int operator1 = userInput.nextInt();
		System.out.print("\n");

		// Allows the user to enter the next number.
		System.out.println("Next number: ");
		double nextNumber = userInput.nextDouble();
		System.out.print("\n");

		// Performs the nextCalc method.
		runningAnswer.nextCalc(operator1, nextNumber);
		System.out.print("Current Answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		
		userInput.close();
	} // End keepGoing.
} // End Methods class.
