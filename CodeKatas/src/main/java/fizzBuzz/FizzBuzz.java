package fizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {

	public static String FIZZ = "fizz";
	public static String BUZZ = "buzz";

	public static ArrayList<String> getFizzBuzzNumbers() {
		ArrayList<String> fizzBuzzList = new ArrayList<>();
		int counter = 0;
		while (++counter <= 150)
			fizzBuzzList.add(getNumber(counter));

		return fizzBuzzList;
	}

	public static String getNumber(int number) {
		String fizzBuzzWords = "";
		
		if (divisableByOrContains(3, number))
			fizzBuzzWords += FIZZ;
		
		if (divisableByOrContains(5, number))
			fizzBuzzWords += BUZZ;
		
		if (!fizzBuzzWords.isEmpty())
			return fizzBuzzWords;
		
		return (Integer.toString(number));

	}
	
	private static boolean divisableByOrContains(int n, int number) {
		return number % n == 0 || Integer.toString(number).indexOf("" + n) != -1;
	}

}
