package question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolyTest {
private Poly polynomial;
	
	//This method tests degreeOfPolynomial method
	@Test
	public void testDegreeOfPolynomial1()
	{
		int[] input = {6,4,2};
		polynomial = new Poly(input);
		assertEquals(2, polynomial.degree());
	}
	@Test(expected = AssertionError.class) //Negative Test Case
	public void testDegreeOfPolynomial2()
	{
		int[] input = {};
		polynomial = new Poly(input);
		assertEquals(2, polynomial.degree());
	}
	
	//This method tests evaluate method
	@Test
	public void testEvaluate()
	{
		int[] input = {6,4,2};
		polynomial = new Poly(input);
		assertEquals((float) 22.0, polynomial.evaluate((float) 2.0),
				(float) 0.0);
	}
	@Test(expected = AssertionError.class)//Negative Test Case
	public void testEvaluatePolynomial2()
	{
		int[] input = {};
		polynomial = new Poly(input);
		assertEquals((float)22.0, polynomial.evaluate((float)2.0), (float)0.0);
	}
	
	//This method tests addPolynomial method
	@Test
	public void testAdd()
	{
		int[] input1 = { 6, 4, 2 };
		int[] input2 = { 6, 0, 4, 2 };

	//	String sumOfPolynomials = "2x^3+6x^2+4x^1+12";
		Poly add=new Poly();
		Poly inputPolynomial1 = new Poly(input1);
		Poly inputPolynomial2 = new Poly(input2);
		assertEquals("[12, 4, 6, 2]", add.add(inputPolynomial1,inputPolynomial2));
	}
	@Test(expected = AssertionError.class)//Negative Test Case
	public void testAddPolynomial2()
	{
		int[] inputCoefficient1 = {};
		int[] inputCoefficient2 = { 6, 0, 4, 2 };
		Poly add=new Poly();
		String sumOfPolynomials = "2x^3+6x^2+4x^1+12";

		Poly inputPolynomial1 = new Poly(inputCoefficient1);
		Poly inputPolynomial2 = new Poly(inputCoefficient2);
		
		assertEquals(sumOfPolynomials, add.add(inputPolynomial1,inputPolynomial2));
	}
	
	//This method tests multiplyPolynomial method
	@Test
	public void testMulPolynomial1()
	{
		int[] inputCoefficient1 = { 5, 0, 10, 6 };
		int[] inputCoefficient2 = { 1, 2, 4 };

	//	String multipliedPloynomial = "24x^5+52x^4+26x^3+30x^2+10x^1+5";
		Poly mul=new Poly();
		Poly inputPolynomial1 = new Poly(inputCoefficient1);
		Poly inputPolynomial2 = new Poly(inputCoefficient2);

		assertEquals("[5, 10, 30, 26, 52, 24]" ,mul.mul( inputPolynomial1,inputPolynomial2));
	}
	@Test(expected = AssertionError.class)//Negative Test Case
	public void testMultiplyPolynomial2()
	{
		int[] inputCoefficient1 = {};
		int[] inputCoefficient2 = { 1, 2, 4 };

		Poly mul=new Poly();
		Poly inputPolynomial1 = new Poly(inputCoefficient1);
		Poly inputPolynomial2 = new Poly(inputCoefficient2);

		assertEquals(new int[]{5,10,30,26,52,24},mul.mul( inputPolynomial1,inputPolynomial2));
	}
}
