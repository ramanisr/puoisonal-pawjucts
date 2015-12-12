package calculator;

import java.util.ArrayList;

public class StringCalculator {

	public static int add(String input) throws Exception {
		if (input.isEmpty())
			return 0;
		String numbers[] = getNumbers(input);
		validate(numbers);
		int sum = 0;
		for (String number : numbers) {
			sum += Integer.parseInt(number);
		}

		return sum;
	}

	public static void validate(String numbers[]) throws Exception {
		ArrayList<Integer> negatives = new ArrayList<Integer>();

		for (String number : numbers) {
			if (Integer.parseInt(number) < 0) {
				negatives.add(Integer.parseInt(number));
			}
		}
		if (!negatives.isEmpty()) {
			throw new Exception("Negative numbers error: "
					+ getNegativeNumberList(negatives));
		}

	}

	public static String getNegativeNumberList(ArrayList<Integer> negatives) {
		// list will never be empty as there is a check in the exception
		// handling (!negatives.isEmpty())
		String negtiveNumbList = negatives.get(0).toString();
		negatives.remove(0);
		for (Integer negativeNumber : negatives) {
			negtiveNumbList = negtiveNumbList + ", " + negativeNumber;
		}
		return negtiveNumbList;
	}

	public static String[] getNumbers(String input) {
		String delimiter = ",|\n";
		if (input.startsWith("//")) {
			delimiter = extractDelimiter(input);
			input = input.substring(4);
		}
		return input.split(delimiter);
	}

	public static String extractDelimiter(String input) {
		return input.substring(2, 3);
	}
	
	public static void main (String args[]){
		
		System.out.println(System.getProperty("java.version"));
	}
}
