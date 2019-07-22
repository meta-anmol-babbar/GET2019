package scfsession4assignment;

import org.junit.Test;
/*
 * test class for negitive test cases for all methods in ArrOperations
 */

public class NegitiveTestCases {

	ArrOperation operation = new  ArrOperation();
	@Test(expected=AssertionError.class)
	public void negitiveMaxMirror() {
		
		int input[]={};
		operation.sizeMaxMirror(input);
		
	}
	
	@Test(expected=AssertionError.class)
	public void negitiveSplitTest() {
		int input[]={};
		operation.split(input);
		
	}
	
	@Test(expected=AssertionError.class)
	public void negitiveCountClumps() {
		int input[]={};
		operation.countClumps(input);
		
	}
	
	@Test(expected=AssertionError.class)
	public void negitiveFixXY() {
		operation.fixXY(new int[]{},4,5);			//entering empty array
		operation.fixXY(new int[] {1,4,1,5,5,4,1}, 4, 5);		// two adjacent X 
		operation.fixXY(new int[] {5,4,1,5,4,5,4}, 4, 5);		// X at last position
		operation.fixXY(new int[] {5,1,1,5,4,5,4}, 4, 5);		//Unequal number of X and Y
		
		
	}

}
