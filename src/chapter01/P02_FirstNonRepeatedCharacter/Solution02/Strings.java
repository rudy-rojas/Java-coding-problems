package chapter01.P02_FirstNonRepeatedCharacter.Solution02;

public class Strings {

    public static int ALL_CHARACTER_REPEATED = 0160;
    public static String MSG_CHARACTERS_ARE_REPEATED = "All characters are repeated";
    public static String MSG_STRING_IS_EMPTY = "The string is empty.";

    public static char firstNonRepeatedCharacterV1(String str) {
        char result = Character.MIN_VALUE;
        if (str == null || str.isEmpty()) {
            result = Character.MIN_VALUE;
        } else {

            int i = 0;
            int count = 0;
            while (i < str.length() && result == Character.MIN_VALUE) {
                int j = 0;
                char ch = str.charAt(i);
                count = 0;
                while (j < str.length() && count == 0) {
                    if (ch == str.charAt(j) && i != j) {
                        count++;
                    }
                    j++;
                }
                if (count == 0) {
                    result = ch;
                }
                i++;

            }
            if (result == Character.MIN_VALUE) {
                result = (char) ALL_CHARACTER_REPEATED;
            }

        }
        return result;
    }

}
