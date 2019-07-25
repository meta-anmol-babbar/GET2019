package question2;


import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	BinarySearch binary=new BinarySearch();
	LinearSearch linear=new LinearSearch();
	
	@Test
	public void LinearTest() {
		
		assertEquals(6,linear.linearSearch(new int[] {2,3,5,8,15,21,29}, 29));
		assertEquals(0,linear.linearSearch(new int[] {2,3,5,8,15,21,29}, 2));
		assertEquals(-1,linear.linearSearch(new int[] {2,3,5,8,15,21,29}, 1));
		
	}
	
	@Test(expected = AssertionError.class)
	public void linearEmptyArrayTest() {
		assertEquals(-1, linear.linearSearch(new int[] {}, 0));
	}
	
	@Test
	public void binaryTest() {
		int input1[]={2,3,5,8,15,21,29};
		assertEquals(0,binary.binarySearch(input1, 2));
		int input2[]={2,3,5,8,15,21,29};
		assertEquals(5,binary.binarySearch(input2, 21));
		int input3[]={2,3,5,8,15,21,29};
		assertEquals(-1,binary.binarySearch(input3, 1));
	}
	
	@Test(expected = AssertionError.class)
	public void binaryEmptyArrayTest() {
		assertEquals(-1, binary.binarySearch(new int[] {}, 0));
	}

}