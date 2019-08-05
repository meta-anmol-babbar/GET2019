package question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MolecularMassCalculatorTest {
	MolecularMassCalculator mass = new MolecularMassCalculator();

	@Test
	public void test() {

		assertEquals(44, mass.calculateCompoundMass("CO2"));
		assertEquals(130, mass.calculateCompoundMass("H2O(C2(O)2)2"));
	}

	@Test(expected = AssertionError.class)
	public void testNegetive() {

		// assertEquals(44,mass.calculateCompoundMass("CO2"));
		assertEquals(130, mass.calculateCompoundMass("H2O(C2OB2)2"));
	}

}
