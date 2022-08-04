package stringExercises;

import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence please...");
        String userString = sc.nextLine();

        replaceCharacter(userString, "d", "f");
    }

    public static void replaceCharacter(String str, String firstChar, String secondChar) {
        String newString = str.replace(firstChar, secondChar);
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newString);
    }
}
