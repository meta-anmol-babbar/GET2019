package question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HcfLcmTest {
	
		EuclidHcf hcf = new EuclidHcf();
		Lcm lcm=new Lcm();
	

	@Test
	public void hcfTest(){
		assertEquals(1, hcf.euclidHcf(7, 9));
		assertEquals(13, hcf.euclidHcf(65, 104));
		assertEquals(2, hcf.euclidHcf(110, 1004));
		assertEquals(1, hcf.euclidHcf(23, 9));
	}
	
	@Test(expected = AssertionError.class)
	public void hcfNegitiveTest() {
		assertEquals(0, hcf.euclidHcf(-1, 9));
	}
	
	@Test
	public void lcmTest(){
		assertEquals(63, lcm.lcm(7, 9));
		assertEquals(520, lcm.lcm(65, 104));
		assertEquals(55220, lcm.lcm(110, 1004));
		assertEquals(6, lcm.lcm(2, 3));
	}
	
	@Test(expected = AssertionError.class)
	public void lcmNegitiveTest() {
		assertEquals(0, lcm.lcm(-1, 9));
	}

}
