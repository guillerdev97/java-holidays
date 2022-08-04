package functionsExercises;

import java.util.Scanner;

public class ThreeNumbersAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Input the second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Input the third number:");
        int thirdNumber = sc.nextInt();

        calculateAverage(firstNumber, secondNumber, thirdNumber);
    }

    public static void calculateAverage(int firstNumber, int secondNumber, int thirdNUmber) {
        int average = (firstNumber + secondNumber + thirdNUmber) / 3;
        System.out.println("Average: " + average);
    }
}
