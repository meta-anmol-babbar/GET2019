package question3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description class for testing nQueen
 *
 */
public class NQueensTest {

NQueens solve = new NQueens();

@Test
public void nQueenProblemTest() {
	int input1[][]=new int[3][3];
	int input2[][]=new int[4][4];
	int input3[][]=new int[8][8];
assertEquals(false,solve.nQueen(input1,0,3));
assertEquals(true, solve.nQueen(input2,0,4));
assertEquals(true, solve.nQueen(input3,0,8));
}


}

