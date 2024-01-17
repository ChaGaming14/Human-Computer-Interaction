package taskperformanceprefinals;

import javax.swing.*;
import java.awt.*;

public class TaskPerformancePreFinals {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MegaCalc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);

        JPanel panel = new JPanel(new FlowLayout());
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        panel.add(textField1);
        panel.add(new JLabel("+"));
        panel.add(textField2);

        JButton addButton = new JButton("Calculate");
        panel.add(addButton);

        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        JButton clearButton = new JButton("Clear");

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultField, BorderLayout.CENTER);
        frame.add(clearButton, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            String input1 = textField1.getText();
            String input2 = textField2.getText();

            if (!input1.isEmpty() && !input2.isEmpty()) {
                try {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int result = num1 + num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            } else {
                resultField.setText("Please enter values in both fields");
            }
        });

        clearButton.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            resultField.setText("");
        });

        frame.setVisible(true);
        frame.pack();
    }
}
