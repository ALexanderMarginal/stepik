package org.stepic.java.CommentsAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
	NegativeTextAnalyzer() {
		keywords = new String[] {":(", "=(", ":|"};
		label = Label.NEGATIVE_TEXT;
	}
}
