package org.stepic.java.CommentsAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {
	SpamAnalyzer(String[] keywords) {
		this.keywords = keywords;
		label = Label.SPAM;
	}
}
