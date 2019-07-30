package question1;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * Class to test methods of IntSet
 * @author Anmol
 */
public class IntSetTest {

	/**
	 * Test case when input set is empty
	 */
	@Test(expected = AssertionError.class)
	public void setIsEmptyTest() {
		IntSet intSet = new IntSet(new int[] {});
		assertEquals(true, intSet.isMember(5));

	}

	/**
	 * A positive Test case for isMember()
	 */
	@Test
	public void isMemberTest() {
		IntSet intSet = new IntSet(new int[] { 1, 3, 5, 8, 12, 15, 18, 40 });
		assertEquals(true, intSet.isMember(5));
		assertEquals(false, intSet.isMember(2));
		assertNotEquals(false, intSet.isMember(12));
	}
	
	/**
	 * A positive Test case for size()
	 */
	@Test
	public void sizeTest() {
		int []input=new int[] { 1, 3, 5, 8, 12, 15, 18, 40 };
		IntSet intSet = new IntSet(input);
		assertEquals(input.length, intSet.size());
		
	}

	/**
	 * A positive Test case for isSubset()
	 */
	@Test
	public void isSubSetTest() {
		IntSet intSet = new IntSet(new int[] { 1, 3, 5, 8, 12, 15, 18, 40 });
		assertEquals(true, intSet.isSubSet(new int[]{ 8, 15 }));
		assertEquals(true, intSet.isSubSet(new int[] { 8, 15, 40 }));
		assertEquals(true, intSet.isSubSet(new int[] { 1, 3, 5, 8, 12, 15, 18, 40 }));
		assertNotEquals(false, intSet.isSubSet(new int[] { 1, 3, 5, 8, 12, 15, 18, 40 }));
	}

	/**
	 * A positive Test case for getComplement()
	 */
	@Test
	public void complimentTest() {
		int []input=new int[] { 1, 3, 5, 8, 12, 15, 18, 40 };
		IntSet intSet = new IntSet(input);
		int[] expectedArray = new int[1000 - input.length];
		int j = 0;
		for (int i = 0; i < 1000; i++) {
			if (!(intSet.isMember(i + 1))) {
				expectedArray[j] = i + 1;
				j++;
			}
		}
		assertArrayEquals(expectedArray, (intSet.getComplement()));
	}

	/**
	 * A positive Test case for union()
	 */
	@Test
	public void unionTest() {
		//IntSet obj =new IntSet();
		int input1[]=new int[] { 1, 3, 5, 8, 12, 15, 18, 40 };
		int input2[]=new int[] { 3, 2, 5, 4, 7, 8 };
		assertArrayEquals(new int[] { 1, 3, 5, 8, 12, 15, 18, 40, 2, 4, 7 }, IntSet.union(input1, input2));

	}
}