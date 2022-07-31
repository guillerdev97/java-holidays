package variablesMathsOperators;

public class NumericOperators {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;
        numericOperations(num1, num2);
        whichNumberIsMajor(num1, num2);
    }
    public static void numericOperations(int num1, int num2) {
        System.out.println("Sume: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
    public static void whichNumberIsMajor(int num1, int num2) {
        if(num1 > num2) {
            System.out.println(num1 + " is major than " + num2);
        }
        if(num2 > num1) {
            System.out.println(num2 + " is major than " + num1);
        }
        if(num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equals.");
        }
    }
}
