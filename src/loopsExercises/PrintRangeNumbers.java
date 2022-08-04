package loopsExercises;

import java.util.Scanner;

public class PrintRangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print numbers: 1 to (write number)...");
        int lastNumber = sc.nextInt();

        printNumbers(lastNumber);
    }

    public static void printNumbers(int num) {
        int sum = 0;
        int evenSum = 0;
        for(int index = 1; index <= num; index++) {
            System.out.println(index);
            sum += index;
            if(index % 2 == 0) {
                evenSum += index;
            }
        }
        System.out.println("Sum result: " + sum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
