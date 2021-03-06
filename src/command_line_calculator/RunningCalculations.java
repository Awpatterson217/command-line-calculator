/* 
 * The RunningCalculations class holds the methods firstCalc and nextCalc.
 * The firstCalc method is only used once, and the nextCalc method can be run infinitely.
 * The looping of the nextCalc method allows for a more flexible user interface.
 */
package command_line_calculator;

public class RunningCalculations {
	public static double currentAnswer;
	// Takes in three variables (firstNum, calculation choice, NextNum). 
	protected void firstCalc(double firstNum, String theOperator, double nextNum){
		switch(theOperator){
		case "+":
			currentAnswer = firstNum + nextNum;

			break; 
		case "-":
			currentAnswer = firstNum - nextNum;

			break;
		case "*":
			currentAnswer = firstNum * nextNum;
	
			break;
		case "/":
			if(firstNum > 0){currentAnswer = firstNum / nextNum;}
			
			else{System.out.println("ERROR: Division by zero");}
			
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} 
	} 
	// Takes in two variables (calculation choice, nextNum).
	protected void nextCalc(String theOperator, double nextNum){
		switch(theOperator){
		case "+":
			currentAnswer = currentAnswer + nextNum;
			break;
		case "-":
			currentAnswer = currentAnswer - nextNum;
			break;
		case "*":
			currentAnswer = currentAnswer * nextNum;
			break;
		case "/":
			if(currentAnswer > 0){currentAnswer = currentAnswer / nextNum;}
			else{System.out.println("ERROR: Division by zero");}
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} 
	} 
	double getCurrentAnswer() {return currentAnswer;} 
}
