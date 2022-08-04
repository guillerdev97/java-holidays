package functionsExercises;

public class GoalsAverage {
    public static void main(String[] args) {
        int goalsArray[] = new int[]{2, 3, 1, 6};

        goalsAverage(goalsArray);
    }

    public static void goalsAverage(int[] goalsArray) {
        int total = 0;
        int length = goalsArray.length;
        for(int goal : goalsArray) {
            total += goal;
        }
        double average = (total*1.0) / length;
        System.out.println("Goals average: " + average);
    }
}
