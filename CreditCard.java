package com.mycompany.creditcard;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class CreditCard implements ActionListener{
    private JFrame frame;
    private JTextField numberField;
    private JButton verifyButton;
    private JLabel validLabel;
    
 public CreditCard (){
    numberField = new JTextField(5);
    validLabel = new JLabel("Valid number!");
    verifyButton = new JButton("Verify CC Number");
    
    JPanel north = new JPanel(new GridLayout(3,10));
    
    north.add(numberField);
    north.add(verifyButton);
    north.add(validLabel);
    
    frame = new JFrame("Credit card number verifier");
    frame.setSize(800,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new FlowLayout());
   frame.add(north,BorderLayout.CENTER);
   north.add(numberField, BorderLayout.WEST);
   
   north.add(verifyButton, BorderLayout.EAST);
   
    north.add(validLabel, BorderLayout.SOUTH);
    
    frame.pack();
    frame.setVisible(true);
    
     verifyButton.addActionListener((ActionListener) this);
 }
    public void actionPerformed(ActionEvent event){
       
    String text = numberField.getText();
    if(isValidCC(text)){
    validLabel.setText("Valid Number");
    }
    else{
    validLabel.setText("Invalid Number");
    }
}
  public boolean isValidCC(String text){
  int sum = 0;
  for(int i = text.length() -1; i>=0; i--){
      int digit = Integer.parseInt(text.substring(i,i+1));
      if(i%2 ==0){
      digit *=2;
      }
      sum += (digit /10)+ (digit%100);
  }
  //valid numbers add up to a multiple of 10
  return sum% 10 == 0 && text.startsWith("4");
  }  
    
    
    public static void main(String[] args) {
       CreditCard cc = new CreditCard();
    }
    
}


