package md.utm.marcel.lab3;

public class TextInfo {
    private String text;
    private String longestWord;
    private Integer sentences;
    private Integer words;
    private Integer letters;
    private Integer vowels;
    private Integer consonants;

    public TextInfo(String text) {
        this.text = text;
        initInfo();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        initInfo();
    }

    private void initInfo() {
        calculateWordsSentences(this.text);
        calculateLetters(this.text);
        findLongestWord(this.text);
    }

    private void calculateWordsSentences(String text) {
        this.words = 0;
        this.sentences = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                this.words++;
            } else if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                this.sentences++;
            }
        }
    }

    private void calculateLetters(String text) {
        text = text.replaceAll("[^A-Za-z]+", "");
        this.letters = text.length();
        this.vowels = 0;
        this.consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                this.vowels++;
            } else {
                this.consonants++;
            }
        }
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
            return true;
        else
            return false;
    }

    private void findLongestWord(String text) {
        text = text.replaceAll("[^A-Za-z]+", " ");
        String wordArray[] = text.split(" ");

        this.longestWord = "";

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > this.longestWord.length()) {
                this.longestWord = wordArray[i];
            }
        }
    }

    @Override
    public String toString() {
        return "TextInfo {" +
                "\n text='" + text + '\'' +
                ",\n longestWord='" + longestWord + '\'' +
                ",\n sentences=" + sentences +
                ",\n words=" + words +
                ",\n letters=" + letters +
                ",\n vowels=" + vowels +
                ",\n consonants=" + consonants +
                "\n}";
    }
}
