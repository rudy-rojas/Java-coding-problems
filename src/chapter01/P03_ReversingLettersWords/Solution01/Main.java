package chapter01.P03_ReversingLettersWords.Solution01;
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
        String reverse = Strings.resersing(Main.TEXT);
        
        System.out.println(reverse);
    }
}
