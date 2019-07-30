package question1;

import java.util.*;

public final class IntSet {
	final int[] inputArray;
	final List<Integer> sampleSpace;
	final List<Integer> set;

	/**
	 * IntSet is a constructor for initialising various instances of class 
	 * @param array is input array from the user
	 */
	IntSet(int[] array) {
		set = new ArrayList<Integer>();
		sampleSpace = new ArrayList<Integer>();
		inputArray = array;
		if(inputArray.length==0)
			throw new AssertionError("Ärray Empty");

		for (int i : inputArray) {		//converting input array to list
			set.add(i);
		}
		for (int i = 1; i <= 1000; i++) {		// creating sample space 
			sampleSpace.add(i);
		}

	}
	/**
	 * isMemeber checks wether the value is present in give set or not
	 * @param value is the input value to check
	 * @return true if value is present else false
	 */

	public boolean isMember(int value) {
		if (set.contains(value))
			return true;
		else
			return false;

	}
	/**
	 * size returns the size of the input set
	 * @return size of the input set
	 */

	public int size() {
		int size = inputArray.length;

		return size;

	}
	/**
	 * isSubSet takes in  a set and checks weather  it is a subset of original set or not
	 * @param subset is entered set
	 * @return true is it is a subset else return false
	 */

	public boolean isSubSet(int[] subset) {

		for (int i = 0; i < subset.length; i++) {
			if (set.contains(subset[i]))
				continue;
			else
				return false;
		}
		return true;

	}
	/**
	 * getCompliment is used to find compliment of entered set(SmpleSpace - Given set) 
	 * @return compliment of set
	 */

	public int[] getComplement() {
		int index = 0;
		int[] compliment;

		List<Integer> complimentList = new ArrayList<Integer>();
		complimentList = sampleSpace;
		for (int i = 0; i < inputArray.length; i++) {
			if (complimentList.contains(inputArray[i]))
				index = complimentList.indexOf(inputArray[i]);
			complimentList.remove(index);
		}

		compliment = new int[complimentList.size()];
		for (int i = 0; i < compliment.length; i++) {
			compliment[i] = complimentList.get(i).intValue();
		}
		
		return compliment;

	}
	/**
	 * union finds union of two entered sets
	 * @param set1 is first set to be used		
	 * @param set2 is second set to be used
	 * @return union of two sets
	 */

	public static int[] union(int set1[], int set2[]) {

		List<Integer> unionList = new ArrayList<Integer>();

		int union[];
		for (int i : set1) {
			if (unionList.contains(i))
				continue;
			unionList.add(i);
		}
		for (int i : set2) {
			if (unionList.contains(i))
				continue;
			else
				unionList.add(i);
		}
		union = new int[unionList.size()];
		for (int i = 0; i < unionList.size(); i++) {
			union[i] = unionList.get(i).intValue();
		}
		return union;

	}

}
