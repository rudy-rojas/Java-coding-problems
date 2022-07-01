package chapter01.P01_CountCharacters.Solution02;

public class TestCharCount {
    public static void main(String[] args) {
        String str = "This is a new test";


        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            System.out.println(str.charAt(i) + " - " +Character.charCount(cp));
        }
    }

}
