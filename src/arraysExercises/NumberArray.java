package arraysExercises;

public class NumberArray {
    public static void main(String[] args) {
        int[] studentsAge = {12, 21, 22, 32, 12};
        int[] studentsMoney = new int[5];
        studentsMoney[0] = 2345;
        studentsMoney[1] = 334;
        studentsMoney[2] = 453;
        studentsMoney[3] = 44456;
        studentsMoney[4] = 2342;
        for(int index = 0; index < studentsAge.length; index++) {
            System.out.println(studentsAge[index]);
        }
        for(int age : studentsMoney) {
            System.out.println(age);
        }
        int max = studentsAge[0];
        for (int index = 1; index < studentsAge.length; index++) {
            max = Math.max(max, studentsAge[index]);
        }
        System.out.println("Maximum age: " + max);
    }
}

