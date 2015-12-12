package fizzBuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

	@Test
	public void everyNumberDivisableBy3IsBuzz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(3), FizzBuzz.FIZZ);
		Assert.assertEquals(fizzBuzzOf(6), FizzBuzz.FIZZ);
		Assert.assertEquals(fizzBuzzOf(9), FizzBuzz.FIZZ);
	}

	@Test
	public void everyNumberDivisableBy5IsBuzz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(5), FizzBuzz.BUZZ);
		Assert.assertEquals(fizzBuzzOf(10), FizzBuzz.BUZZ);
		Assert.assertEquals(fizzBuzzOf(20), FizzBuzz.BUZZ);
	}
	
	@Test
	public void everyNumberDivisableBy3And5IsFizzBuzz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(15), FizzBuzz.FIZZ + FizzBuzz.BUZZ);
		Assert.assertEquals(fizzBuzzOf(30), FizzBuzz.FIZZ + FizzBuzz.BUZZ);
	}
	
	@Test
	public void anyNumberWithA3IsFizz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(13), FizzBuzz.FIZZ);
		Assert.assertEquals(fizzBuzzOf(23), FizzBuzz.FIZZ);
	}
	
	@Test
	public void anyNumberWithA5IsBuzz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(56), FizzBuzz.BUZZ);
		Assert.assertEquals(fizzBuzzOf(58), FizzBuzz.BUZZ);
	}
	
	@Test
	public void anyNumberWith3And5IsFizzBuzz() throws Exception {
		Assert.assertEquals(fizzBuzzOf(35), FizzBuzz.FIZZ + FizzBuzz.BUZZ);
		Assert.assertEquals(fizzBuzzOf(53), FizzBuzz.FIZZ + FizzBuzz.BUZZ);
	}
	
	public String fizzBuzzOf(int n) {
		return FizzBuzz.getFizzBuzzNumbers().get(n - 1);
	}

}
