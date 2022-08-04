package stringExercises;

public class RemoveCharacter {
    public static void main(String[] args) {
        String example = "This is an example";
        int position = 3;
        String newString = removeCharAt(example, position);
        System.out.println("String without remove: " + example);
        System.out.println("String with remove: " + newString);


    }

    public static String removeCharAt(String str, int pos) {
        return str.substring(0, pos) + str.substring(pos + 1);

    }
}
