package question1;

public class EuclidHcf {
	
	/**
	 * euclidHcf is used to calculate hcf using Euclid Method
	 * @param value1 is first value from user
	 * @param value2 is second value from user
	 * @return HCF of given two values
	 */
	protected int euclidHcf(int value1, int value2) {
		if(value1<0 || value2<0 )
			throw new AssertionError("Enetr Positive Values");
		
		if (value2 == 0) 
			return value1;
	
		return euclidHcf(value2, value1%value2);

	}


}
