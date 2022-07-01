package chapter01.P01_CountCharacters.Solution02;

import java.util.concurrent.TimeUnit;

import chapter01.P01_CountCharacters.Solution01.*;
import java.util.Map;

public class Main {
    private static final String TEXT = "Don Quixote, fully titled The Ingenious Gentleman"
            + " Don Quixote of La Mancha (Spanish: El ingenioso"
            + " hidalgo don Quijote de la Mancha), is a Spanish novel"
            + " by Miguel de Cervantes Saavedra";

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String[][] method01 = CountDuplicateCharacters.getDuplicateCharacters(TEXT);
        showExecutionTime(System.nanoTime() - startTime);
        CountDuplicateCharacters.showMatrixFormat(method01);
        addBR();

        startTime = System.nanoTime();
        Map<Character, Integer> method02 = Strings.countDuplicateCharactersV1(TEXT);
        showExecutionTime(System.nanoTime() - startTime);
        System.out.println(method02);
        addBR();

        startTime = System.nanoTime();
        Map<String, Integer> method03 = Strings.countDuplicateCharactersVCP1(TEXT);
        showExecutionTime(System.nanoTime() - startTime);
        System.out.println(method03);


        

    }

    public static void showExecutionTime(long time) {
        System.out.println("Execution Time: " + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms");
    }

    public static void addBR() {
        System.out.println("+---------------------------------------------------------+");
    }
}
