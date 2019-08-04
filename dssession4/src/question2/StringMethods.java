package question2;

import java.util.HashSet;

public class StringMethods {

	Cache cache = new Cache();

	/**
	 * this methods checks if entered string is present in cache or not if
	 * present it gives length otherwise it adds it to cache and returns length
	 * 
	 * @param givenString
	 *            is the input string
	 * @return length and message
	 */
	public String checkString(String givenString) {
		HashSet<Character> uniqueCharSet = new HashSet<Character>();
		int noOfUniqueChar = 0;
		givenString = givenString.toUpperCase();
		if (cache.cacheMamory.containsKey(givenString)) { // checking cache
			return ("String Exists In Cache \nNo.Of Unique Cahacters : " + cache.cacheMamory
					.get(givenString + "\n")).toString();

		} else { // finding unique char and adding it to cache
			for (int i = 0; i < givenString.length(); i++)
				if (uniqueCharSet.add(givenString.charAt(i))) {
					System.out.print(givenString.charAt(i) + "\t");
					noOfUniqueChar++;
				}
		}
		cache.cacheAdd(givenString, noOfUniqueChar);
		return ("\n No.Of Unique Cahacters : "
				+ cache.cacheMamory.get(givenString) + "\n").toString();
	}

	/**
	 * this method prints all the elements present in stack
	 */
	public void printCache() {
		System.out.println(cache.cacheMamory + "\n");
	}
}
