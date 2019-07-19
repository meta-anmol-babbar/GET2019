package question2;

public class BinarySearch {
	
	/**
	 * binarySearch is used to search element by recursively dividing array in half until element is found
	 * @param inputArray is the array from user
	 * @param element is the element to be found
	 * @return value of index
	 */	
	public int binarySearch(int inputArray[],int element){
			if(inputArray.length==0 )
				throw new AssertionError("Array empty");
			int start=0;
			int end=inputArray.length;
			int index=binarySearchRecorsive(inputArray,start,end,element);
			return index;
		}
			
		public static int binarySearchRecorsive(int inputArray[], int startIndex, int arrayLength, int element) 
		    { 
		        if (arrayLength >= startIndex) { 
		            int mid = startIndex + (arrayLength - startIndex) / 2;
		            if (inputArray[mid] == element) 
		                return mid; 
		  
		            if (inputArray[mid] > element) 
		                return binarySearchRecorsive(inputArray, startIndex, mid - 1, element); 
		  
		             return binarySearchRecorsive(inputArray, mid + 1, arrayLength, element); 
		        } 
		  
		        return -1; 
		    } 


}
