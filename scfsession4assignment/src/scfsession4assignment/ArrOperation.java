package scfsession4assignment;

import java.util.ArrayList;
import java.util.List;

import junit.framework.AssertionFailedError;

public class ArrOperation {
	
	/**
	 * countClump counts number of clumps in given array
	 * @param inputArray takes array of integer as input
	 * @return clumps return total number of clumps found
	 */
	protected int countClumps(int inputArray[]) {
		if (inputArray.length == 0) 
			throw new AssertionFailedError("Array has no element");		//throwing assertion error

		int temp = inputArray[0];

		int tempcount = 0, clumps = 0;

		for (int i = 1; i < inputArray.length; i++) {
			if (temp == inputArray[i]) {
				tempcount++;
			if (tempcount == 1) {
				clumps++;
				}
			} else {
				temp = inputArray[i];
				tempcount = 0;
			}
		}
		
	
		return clumps;
		
	}
	/**
	 * FixXY is a method where X is fixed and Y is in just next position of X
	 * @param inputArray takes array of integer as input
	 * @param X Value of X to be used
	 * @param Y Value of Y to be used
	 * @return array of integers with proper position of X and Y
	 */
	protected int[] fixXY(int inputArray[], int X, int Y) {
		if (inputArray.length == 0) {
			throw new AssertionFailedError("Array has no element");	// throwing assertion array for array size 0
		} else if (inputArray[inputArray.length - 1] == X) {							
			throw new AssertionFailedError("Array has X in last position");	//throwing assertion if  X i as last position in array
		} else {
			List<Integer> posX = new ArrayList<Integer>();
			List<Integer> posY = new ArrayList<Integer>();
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] == X) {
					if (i > 0 && inputArray[i - 1] != X) {
						posX.add(i);
					} else
						throw new AssertionFailedError(
								"Array has two consicutive X");		//throwing assertion error if array h two X together
				} else if (inputArray[i] == Y) {
					posY.add(i);
				}
			}
			if (posX.size() != posY.size())
				throw new AssertionFailedError("Array has Unequal X and Y");	//throwing assertion error if number of X and Y are different

			for (int i = 0; i < posX.size(); i++) {
				int temp = 0;
				int indexX = posX.get(i);
				int indexY = posY.get(i);
				temp = inputArray[indexY];
				inputArray[indexY] = inputArray[indexX + 1];
				inputArray[indexX + 1] = temp;
			}
		}
		return inputArray;
	}
	/**
	 * sizeMaxMirror finds the size of the maximum size of mirror
	 * @param inputArray takes array of integer as input 
	 * @return lengthOfMirror which is highest value of mirror size
	 */
	protected int sizeMaxMirror(int inputArray[]) {
		if (inputArray.length == 0) // Throwing Assertion Error if array size is 0
			throw new AssertionError("Array has no element");
		int i, j;
		int lengthOfMirror = 0;
		int tempLength;
		int arrayLength = inputArray.length;
		for (i = 0; i < arrayLength; i++) {
			tempLength = 0;
			for (j = arrayLength - 1; j >= 0
					&& (i + tempLength) < arrayLength; j--) {
				if (inputArray[i + tempLength] == inputArray[j]) {
					tempLength++;
				} else {
					tempLength = 0;
				}
			}

			lengthOfMirror = Math.max(lengthOfMirror,
					tempLength);
		}
		return lengthOfMirror;
	}
	/**
	 * split is used to split array with index from where size of so created two arrays are equal
	 * @param inputArray takes array of integer as input 
	 * @return index if sum of two formed arrays are equal otherwise return -1 
	 */
	protected int split(int inputArray[]) {
		if (inputArray.length == 0) 			// Throwing Assertion Error if array size is 0
			throw new AssertionError("Array size can't be zero");
		int sum = 0, leftSum = 0, rightSum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		int index;
		for (index = inputArray.length - 1; index > 0; index--) {
			rightSum += inputArray[index];
			leftSum = sum - rightSum;
			if (leftSum == rightSum) {
				return index;
			}
		}
		if (index == 0)
			return -1;
		return -1;
	}

}
