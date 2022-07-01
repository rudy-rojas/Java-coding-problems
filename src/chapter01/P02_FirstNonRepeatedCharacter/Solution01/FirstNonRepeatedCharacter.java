package chapter01.P02_FirstNonRepeatedCharacter.Solution01;

/**
 * @author @rudy-rojas
 */
public class FirstNonRepeatedCharacter {
    private static final String TEXT = "If you want a more streamlined way to use media"
            + "like this to pick up English phrases, a program like.";

    // private static final String TEXT = "aabbcc";

    private static final String RESULT_DEFAULT = "All characters are repeated";

    private FirstNonRepeatedCharacter() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static void main(String[] args) {
        String ch = getFirstNonRepeatedCharacter(TEXT);
        System.out.println("Result: " + ch);
    }

    public static String getFirstNonRepeatedCharacter(String str) {
        String result = RESULT_DEFAULT;
        int i = 0;
        boolean isFound = true;

        while (i < str.length() && isFound) {
            if (!isRepeated(str, str.charAt(i))) {
                isFound = false;
                result = String.valueOf(str.charAt(i));
            } else {
                i++;
            }
        }
        return result;
    }

    private static boolean isRepeated(String str, char ch) {
        int repeated = 0;
        int i = 0;

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == ch) {
        // result = true;
        // }
        // }

        while (i < str.length() && repeated <= 1) {
            if (str.charAt(i) == ch) {
                repeated++;
            }
            i++;

        }
        return (repeated > 1) ? true : false;
    }

}
