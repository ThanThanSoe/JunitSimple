package com.tts.test;

public class Calculator {
	public static int sum(int a, int b) {
		return a + b;
	}

	
	public static int subtraction(int a, int b) {
		return a - b;
	}

	
	public int multiplication(int a, int b) {
		return a * b;
	}

	
	public static int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	
	public static boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
