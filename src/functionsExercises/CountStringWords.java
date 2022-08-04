package functionsExercises;

public class CountStringWords {
    public static void main(String[] args) {
        String sentence = "I am learning Java by doing.";

        countStringWords(sentence);
    }

    public static void countStringWords(String text) {
        String[] textIntoArray = text.split(" ");
        int arrayLength = textIntoArray.length;
        System.out.println(text);
        System.out.println("Total words in this string: " + arrayLength);
    }
}
