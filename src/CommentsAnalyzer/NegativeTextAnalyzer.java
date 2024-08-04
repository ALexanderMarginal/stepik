package CommentsAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
	NegativeTextAnalyzer() {
		keywords = new String[] {":(", "=(", ":|"};
		label = Label.NEGATIVE_TEXT;
	}
}
