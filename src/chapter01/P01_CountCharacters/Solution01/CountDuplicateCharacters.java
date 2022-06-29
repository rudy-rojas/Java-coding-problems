package chapter01.P01_CountCharacters.Solution01;

import java.util.ArrayList;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        String text = "This is a test text";
        String[][] duplicates = getDuplicateCharacters(text);
        showMatrix(duplicates);
        showMatrixFormat(duplicates);
    }

    public static String[][] getDuplicateCharacters(String text) {
        ArrayList<String> index = getSizeMatrix(text);
        String[][] answer = new String[2][index.size()];
        copyIndex(answer, index);
        countDuplicates(answer, text);
        return answer;
    }

    private static void countDuplicates(String[][] matrix, String text) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[1][i] = String.valueOf(getTotalDuplicates(matrix[0][i].charAt(0), text));
        }
    }

    private static int getTotalDuplicates(char character, String text) {
        int totalCharacters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                totalCharacters += 1;
            }
        }
        return totalCharacters;
    }

    private static void copyIndex(String[][] matrix, ArrayList<String> arrayList) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = arrayList.get(i);
        }
    }

    private static ArrayList<String> getSizeMatrix(String text) {
        ArrayList<String> uniqueCharacters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (!isThereCharacter(uniqueCharacters, text.charAt(i))) {
                uniqueCharacters.add(String.valueOf(text.charAt(i)));
            }
        }
        return uniqueCharacters;
    }

    private static boolean isThereCharacter(ArrayList<String> arrayList, char character) {
        boolean isThere = false;
        int i = 0;
        while (i < arrayList.size() && !isThere) {
            if (arrayList.get(i).charAt(0) == character) {
                isThere = true;
            } else {
                i++;
            }
        }
        return isThere;
    }

    private static void showMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");                
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void showMatrixFormat(String[][] matrix) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.println(matrix[0][j] + " = " + matrix[1][j]);
        }
        System.out.println();
    }
}
