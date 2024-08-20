package org.stepik.java;

import java.math.BigInteger;

public class Factorial {
	/**
	 * Calculates factorial of given <code>value</code>.
	 *
	 * @param value positive number
	 * @return factorial of <code>value</code>
	 */
	public static BigInteger factorial(int value) {
		BigInteger result = BigInteger.ONE;

		if (value == 0) {
			return result;
		}

		int factor = 1;

		while (factor <= value) {
			result = result.multiply(BigInteger.valueOf(factor));
			factor++;
		}

		return result;
	}
}
