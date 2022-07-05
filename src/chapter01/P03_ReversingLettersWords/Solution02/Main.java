package chapter01.P03_ReversingLettersWords.Solution02;

import java.util.concurrent.TimeUnit;

public class Main {

    private static String TEXT = "In this section you will learn about structuring"
            + " paragraphs in a clear and logical way. These skills will enable you"
            + " to look at ways that your own writing can be improved."
            + " Notice the use of the synonyms advantages and benefits. The concluding"
            + " sentence reiterates the idea that owning a hybrid is advantageous"
            + " without using the exact same words. It also summarises two examples of"
            + " the advantages covered in the supporting sentences: low running costs and"
            + " environmental benefits.";

    public static void main(String[] args) {
        System.out.println("First method");
        long startTime = System.nanoTime();
        String firstSolution = chapter01.P03_ReversingLettersWords.Solution01.Strings.resersing(TEXT);
        showExecutionTime(System.nanoTime() - startTime);
        System.out.println(firstSolution);

        addBr();

        System.out.println("Second method");
        startTime = System.nanoTime();
        String secondSolution = Strings.reverseWordsV1(TEXT);
        showExecutionTime(System.nanoTime() - startTime);
        System.out.println(secondSolution);
    }

    private static void showExecutionTime(long time) {
        System.out.println("Time: " + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms.");
    }

    private static void addBr() {
        System.out.println("+-----------------------------------------+");
    }

}
