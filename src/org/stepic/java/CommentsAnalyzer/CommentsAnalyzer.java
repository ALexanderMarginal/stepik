package org.stepic.java.CommentsAnalyzer;

public class CommentsAnalyzer {
	public Label checkLabels(TextAnalyzer[] analyzers, String text) {
		for (TextAnalyzer analyzer : analyzers) {
			Label result = analyzer.processText(text);
			if (result != Label.OK) {
				return result;
			}
		}
		return Label.OK;
	}
}
