/* 
 * The RunningCalculations class holds the methods firstCalc and nextCalc.
 * The firstCalc method is only used once, and the nextCalc method can be run infinitely.
 * The looping of the nextCalc method allows for a more flexible user interface.
 */

package command_line_calculator;

public class RunningCalculations {
	static double currentAnswer;

	// Takes in three variables (firstNum, calculation choice, NextNum). 
	//  Where n = 1,2,3 or 4: (1 = +)(2 = -)(3 = *)(4 = /).
	protected void firstCalc(double firstNum, int theOperator, double nextNum){
		switch(Integer.valueOf(theOperator)){
		case 1:
			currentAnswer = firstNum + nextNum;
			setCurrentAnswer(currentAnswer);
			break; 
		case 2:
			currentAnswer = firstNum - nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		case 3:
			currentAnswer = firstNum * nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		case 4:
			currentAnswer = firstNum / nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} // End switch.
	} // End firstCalc.
	
	// Takes in two variables (calculation choice, nextNum).
	//  Where n = 1,2,3 or 4: (1 = +)(2 = -)(3 = *)(4 = /).
	protected void nextCalc(int theOperator, double nextNum){
		switch(Integer.valueOf(theOperator)){
		case 1:
			currentAnswer = currentAnswer + nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		case 2:
			currentAnswer = currentAnswer - nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		case 3:
			currentAnswer = currentAnswer * nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		case 4:
			currentAnswer = currentAnswer / nextNum;
			setCurrentAnswer(currentAnswer);
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} // End switch.
	} // End nextCalc.

    void setCurrentAnswer(double currentAnswer) {
		RunningCalculations.currentAnswer = currentAnswer;
	} // End setter.
	
	double getCurrentAnswer() {
		return currentAnswer;
		
	} // End getter.
}
