package com.mycompany.bmigui01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMIGUI01  implements ActionListener{

        private JFrame frame;
        private JTextField heightTextField;
        private JTextField weightTextField;
        private JLabel bmiLabel;
        private JButton computeButton;
        
        public BMIGUI01(){
               heightTextField = new JTextField(5);
               weightTextField = new JTextField(5);
               
               bmiLabel =  new JLabel("Type your height and weight");
               computeButton = new JButton("Compute");
               
               JPanel panel = new JPanel(new GridLayout(3,3));
               panel.add(bmiLabel);
               panel.add(heightTextField);
               panel.add(weightTextField);
               panel.add(computeButton);
               
               panel.add(new JLabel("HEIGHT:    "));
               panel.add(new JLabel("WEIGHT:    "));
               
               frame = new JFrame("CalculateBMI");
               frame.setSize(600,600);
               frame.add(panel);
               frame.setVisible(true);
               frame.pack();
               
               frame.setLayout(new BorderLayout());
               frame.add(bmiLabel, BorderLayout.CENTER);
               frame.add(computeButton, BorderLayout.SOUTH);
               
               computeButton.addActionListener((ActionListener) this);
    }
               
       
        public static void main (String [] args){
            BMIGUI01 BMIGUI01 = new BMIGUI01();
        }
        public void actionPerformed(ActionEvent event){
               
                   String heightText = heightTextField.getText();
                   double height = Double.parseDouble(heightText);
                   String weightText = weightTextField.getText();
                   double weight = Double.parseDouble(weightText);
                   
                   double bmi = weight / (height * weight) * 703;
                   bmiLabel.setText("BMI" + bmi);
               }
}
