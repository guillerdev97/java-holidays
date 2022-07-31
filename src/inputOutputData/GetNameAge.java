package inputOutputData;

import javax.swing.JOptionPane;

public class GetNameAge {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Write your name please...");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Write your age please..."));
        JOptionPane.showMessageDialog(null, "Hello " + name + ".");
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
        // concatenation: no interpolation using + operator
        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + " years old.");
    }
}
