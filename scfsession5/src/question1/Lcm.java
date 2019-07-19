package question1;

public class Lcm {
	
	/**
	 * LCM is used to calculate Lcm of two numbers
	 * @param value1 is first value from user
	 * @param value2 is second value from user
	 * @return LCM of given two values
	 */
	protected int lcm(int value1,int value2) {
		if(value1<0 || value2<0 )
			throw new AssertionError("Enetr Positive Values");
		int counter =0;
		int lcmOfNumbers=lcmRecursive(value1, value2, counter);
		return lcmOfNumbers;		
	}
	
	protected int lcmRecursive(int value1, int value2,int counter) {
		counter++;
		double larger = Math.max(value1, value2);
		double smaller = Math.min(value1, value2);
		//System.out.println("larger ="+ larger+ " smaller ="+ smaller);
		if (larger % smaller == 0)
			return (int)larger;
		else {
			larger = (int)larger+(larger/counter);
			return lcmRecursive((int)larger, (int)smaller,counter);
		}

	}

}
