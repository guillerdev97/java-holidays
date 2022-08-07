package inputOutputData;

import java.util.Scanner;
import java.util.Arrays;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersDb = new int[4];
        for(int times = 0; times < 4; times++) {
            System.out.println("Write number " + (times + 1) + ":");
            numbersDb[times] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbersDb));

        numbersAverage(numbersDb);
    }

    public static void numbersAverage(int[] numbersDb) {
        double average = 0.0;

        for(int number : numbersDb) {
            average = average + number;
        }
        average = average / numbersDb.length;
        System.out.println("Average: " + average);
    }
}
