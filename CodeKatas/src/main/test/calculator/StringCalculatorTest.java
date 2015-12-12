package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCalculatorTest {

	@Test
	public void addingEmptyStringReturnsZero() throws Exception 
	{
		Assert.assertEquals(StringCalculator.add(""), 0);
	}
	
	@Test
	public void addingASingleNumberReturnsTheSameNumber() throws Exception {
		Assert.assertEquals(StringCalculator.add("5"), 5);
	}
	
	@Test
	public void addsNumbersSeparatedByCommas() throws Exception {
		Assert.assertEquals(StringCalculator.add("5,4,3,2"), 14);
	}
	
	@Test
	public void addsNumbersSeparatedByNewlines() throws Exception {
		Assert.assertEquals(StringCalculator.add("5,4\n2"), 11);
	}
	
	@Test
	public void addsNumbersWithCustomDelimiter() throws Exception {
		Assert.assertEquals(StringCalculator.add("//;\n5;4;2"), 11);
		Assert.assertEquals(StringCalculator.add("//-\n5-4-2"), 11);
	}
	
	@Test
	public void addsNegativeNumbersThrowsError() {
		try {
			StringCalculator.add("-5,-4\n2");
			Assert.fail("Should've thrown an exception");
		} catch (Exception exception) {
			Assert.assertEquals("Negative numbers error: -5, -4", exception.getMessage());
		}
	}
	
	@Test
	public void addsANegativeNumbersThrowsError() {
		try {
			StringCalculator.add("-5,4\n2");
			Assert.fail("Should've thrown an exception");
		} catch (Exception exception) {
			Assert.assertEquals("Negative numbers error: -5", exception.getMessage());
		}
	}
}
