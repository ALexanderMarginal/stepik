package org.stepic.java;

import java.util.ArrayList;
import java.util.List;

public class BooleanExpression {
	public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
		List<Boolean> booleanList = new ArrayList<Boolean>() {{
			add(a);
			add(b);
			add(c);
			add(d);
		}};
		int counter = 0;
		for (boolean item : booleanList) {
			if (item) {
				counter++;
			}
		}
		return counter == 2;
	}
}
