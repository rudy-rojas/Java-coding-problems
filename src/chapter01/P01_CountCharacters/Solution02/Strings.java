package chapter01.P01_CountCharacters.Solution02;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class Strings {
    private Strings() {
        throw new AssertionError("This Cannot be instantiated");
    }

    public static Map<Character, Integer> countDuplicateCharactersV1(String text) {
        if (text == null || text.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<Character, Integer> result = new HashMap<>();

        int i = 0;
        for (char ch : text.toCharArray()) {
            ch = text.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
            i++;
        }
        return result;
    }

    public static Map<String, Integer> countDuplicateCharactersVCP1(String text) {
        if (text == null || text.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            int cp = text.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            result.compute(ch, (key, value) -> (value == null)? 1: ++value);
        }
        return result;
    }

}