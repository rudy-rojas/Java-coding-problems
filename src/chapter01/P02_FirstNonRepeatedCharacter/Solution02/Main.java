package chapter01.P02_FirstNonRepeatedCharacter.Solution02;

import java.util.concurrent.TimeUnit;

import chapter01.P02_FirstNonRepeatedCharacter.Solution01.FirstNonRepeatedCharacter;

public class Main {
    // private static final String TEXT = "aabbcc i";
    private static final String TEXT = "This main idea is usually introduced in the first sentence of the paragraph, called the topic sentence. The idea is then developed further through the sentences that follow.";

    public static void main(String[] args) {

        String str = TEXT;

        // First solution
        long startTime = System.nanoTime();
        String c2 = FirstNonRepeatedCharacter.getFirstNonRepeatedCharacter(str);
        showExecutionTime(System.nanoTime() - startTime);

        // second solution
        startTime = System.nanoTime();
        char c = Strings.firstNonRepeatedCharacterV1(str);
        showExecutionTime(System.nanoTime() - startTime);
        if (c == Character.MIN_VALUE) {
            System.out.println(Strings.MSG_STRING_IS_EMPTY);
        }
        if (c == Strings.ALL_CHARACTER_REPEATED) {
            System.out.println(Strings.MSG_CHARACTERS_ARE_REPEATED);
        } else {
            System.out.println(c);
        }

    }

    public static void showExecutionTime(long time) {
        System.out.println("Execution Time: " + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms.");
        System.out.println("+---------------------------------------------------+");
    }

}
