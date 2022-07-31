package inputOutputData;

import javax.swing.JOptionPane;

public class EvenOddNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Write a number please..."));
        if(number % 2 == 0) {
            JOptionPane.showMessageDialog(null, number + " is even.");
            System.out.println(number + " is even.");
        }
        if(number % 2 != 0) {
            JOptionPane.showMessageDialog(null, number + " is odd.");
            System.out.println(number + " is odd.");
        }
    }
}
