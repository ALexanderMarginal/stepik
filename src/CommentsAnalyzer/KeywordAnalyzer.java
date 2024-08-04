package CommentsAnalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {
	protected String[] keywords;
	protected Label label;

	@Override
	public Label processText(String text) {
		for (String keyword : keywords) {
			if (text.contains(keyword)) {
				return label;
			}
		}
		return Label.OK;
	}
}
