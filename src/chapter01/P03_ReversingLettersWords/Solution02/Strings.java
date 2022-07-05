package chapter01.P03_ReversingLettersWords.Solution02;

public class Strings {

    private static final String WHITESPACE = " ";

    private Strings() {
        throw new AssertionError("Cannot be instantiated.");
    }

    public static String reverseWordsV1(String str) {
        StringBuilder reverseString = new StringBuilder();
        if (str != null || !str.isEmpty()) {
            String[] words = str.split(WHITESPACE);
            for (String word : words) {
                StringBuilder reverseWord = new StringBuilder();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reverseWord.append(word.charAt(i));
                }
                reverseString.append(reverseWord).append(WHITESPACE);
            }
        }
        return reverseString.toString();
    }

}
