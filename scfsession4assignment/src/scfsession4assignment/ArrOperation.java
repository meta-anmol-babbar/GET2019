package scfsession4assignment;

import java.util.ArrayList;
import java.util.List;

import junit.framework.AssertionFailedError;

public class ArrOperation {

	protected int countClumps(int arr[]) {
		if (arr.length == 0) 
			throw new AssertionFailedError("Array has no element");		//throwing assertion error

		int temp = arr[0];

		int tempcount = 0, clumps = 0;

		for (int i = 1; i < arr.length; i++) {
			if (temp == arr[i]) {
				tempcount++;
			if (tempcount == 1) {
				clumps++;
				}
			} else {
				temp = arr[i];
				tempcount = 0;
			}
		}
		
	
		return clumps;
		
	}

	protected int[] fixXY(int arr[], int X, int Y) {
		if (arr.length == 0) {
			throw new AssertionFailedError("Array has no element");	// throwing assertion array for array size 0
		} else if (arr[arr.length - 1] == X) {							
			throw new AssertionFailedError("Array has X in last position");	//throwing assertion if  X i as last position in array
		} else {
			List<Integer> posX = new ArrayList<Integer>();
			List<Integer> posY = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == X) {
					if (i > 0 && arr[i - 1] != X) {
						posX.add(i);
					} else
						throw new AssertionFailedError(
								"Array has two consicutive X");		//throwing assertion error if array h two X together
				} else if (arr[i] == Y) {
					posY.add(i);
				}
			}
			if (posX.size() != posY.size())
				throw new AssertionFailedError("Array has Unequal X and Y");	//throwing assertion error if number of X and Y are different

			for (int i = 0; i < posX.size(); i++) {
				int temp = 0;
				int indexX = posX.get(i);
				int indexY = posY.get(i);
				temp = arr[indexY];
				arr[indexY] = arr[indexX + 1];
				arr[indexX + 1] = temp;
			}
		}
		return arr;
	}

	protected int sizeMaxMirror(int arr[]) {
		if (arr.length == 0) // Throwing Assertion Error if array size is 0
			throw new AssertionError("Array has no element");
		int i, j;
		int lengthOfMirror = 0;
		int tempLength;
		int arrayLength = arr.length;
		for (i = 0; i < arrayLength; i++) {
			tempLength = 0;
			for (j = arrayLength - 1; j >= 0
					&& (i + tempLength) < arrayLength; j--) {
				if (arr[i + tempLength] == arr[j]) {
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

	protected int split(int arr[]) {
		if (arr.length == 0) 			// Throwing Assertion Error if array size is 0
			throw new AssertionError("Array size can't be zero");
		int sum = 0, leftSum = 0, rightSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int index;
		for (index = arr.length - 1; index > 0; index--) {
			rightSum += arr[index];
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
