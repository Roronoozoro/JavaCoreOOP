import com.sun.tools.javac.Main;

public class PracticalTask06 {
    public static void main(String[] args) {

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;

    }

    public interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    public abstract class KeywordAnalyzer implements TextAnalyzer {
        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            String[] keywods = getKeywords();
            for (String keyword : keywods) {
                if (text.contains(keyword)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }


    public class NegativeTextAnalyzer extends KeywordAnalyzer {
        private final String[] keywords1 = {":(", "=(", ":|"};


        @Override
        protected String[] getKeywords() {
            return keywords1;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public class SpamAnalyzer extends KeywordAnalyzer {
        private String[] keywords;

        public SpamAnalyzer(String[] texts) {
            this.keywords = texts;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }


    }

    public class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int toLong) {
            this.maxLength = toLong;
        }


        @Override
        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            }
            return Label.OK;
        }
    }
}



