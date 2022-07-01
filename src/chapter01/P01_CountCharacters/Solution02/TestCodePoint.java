package chapter01.P01_CountCharacters.Solution02;

public class TestCodePoint {
    public static void main(String[] args) {
        String str = "A@";
        int cp = str.codePointAt(1);
        int cp2 = (int)str.charAt(1);
        System.out.println("Code point: " + cp);
        System.out.println("Code point 2: " + cp2);

    }
    
}
