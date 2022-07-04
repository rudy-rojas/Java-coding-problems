package chapter01.P03_ReversingLettersWords.Solution01;

public class Strings {

    private Strings() {
        new AssertionError("Cannot be instantiated.");
    }

    public static String resersing(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            String currentWord = getWord(str, i);
            result += reversingWord(currentWord);
            i = i + currentWord.length() + 1;
            if (i < str.length()) {
                result += " ";
            }
        }
        return result;
    }

    private static String reversingWord(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    private static String getWord(String str, int pos) {
        String wordFound = "";
        int i = pos;
        while (i < str.length() && str.charAt(i) != ' ') {
            wordFound += str.charAt(i);
            i++;
        }
        return wordFound;
    }
}
