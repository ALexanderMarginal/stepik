package org.stepic.java;

public class DoubleExpression {
	public static boolean doubleExpression(double a, double b, double c) {
		return Math.abs((a + b) - c) < 1e-4;
	}
}
