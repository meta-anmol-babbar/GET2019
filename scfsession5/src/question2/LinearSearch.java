package question2;

public class LinearSearch {
	/**
	 * linearSearch is used to search element linearly
	 * @param inputArray is the array from user
	 * @param element is the element to be found
	 * @return value of index
	 */
	protected int linearSearch(int inputArray[],int element){
		if(inputArray.length==0 )
			throw new AssertionError("Array empty");
		int linearCheckIndex=0;
		int index=linearSearchRecursive(inputArray, element, linearCheckIndex);
		return index;
		
	}
	
	protected int linearSearchRecursive(int inputArray[],int element,int checkIndex){
		if(inputArray[checkIndex]==element)
			return checkIndex;
		else if(checkIndex==inputArray.length-1)
			return -1;
			checkIndex++;
		return linearSearchRecursive(inputArray,element,checkIndex);
	}

}
