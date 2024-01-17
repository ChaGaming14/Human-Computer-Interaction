/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lumagbascj;

/**
 *
 * @author COMLAB101
 */
import java.awt.*;
import javax.swing.*;
public class LumagbasCJ {

    public static void main(String[] args) {
     JFrame frame = new JFrame("Layout Question!");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setLayout(new BorderLayout());
       
        JPanel panel1 = new JPanel(new GridLayout(1, 4));
        JLabel label1 = new JLabel("Buttons:");
        label1.setHorizontalAlignment(JLabel.CENTER);
        JButton btn1 = new JButton("hi");
        JButton btn2 = new JButton("long name ");
        JButton btn3 = new JButton("bye");
        panel1.add(label1);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
       
        JPanel panel2 = new JPanel(new GridLayout(1, 1));
        JButton cancelBtn = new JButton("Cancel");
        panel2.add(cancelBtn);
       
        JPanel panel3 = new JPanel(new BorderLayout());
        JPanel cbContainer = new JPanel(new GridLayout(6,1));
        JCheckBox cb1 = new JCheckBox("Bold");
        JCheckBox cb2 = new JCheckBox("Italic");
        JCheckBox cb3 = new JCheckBox("Undeline");
        JCheckBox cb4 = new JCheckBox("Strikeout");
       
        cbContainer.add(cb1);
        cbContainer.add(cb2);
        cbContainer.add(cb3);
        cbContainer.add(cb4);
       
       
        JPanel btn1Container = new JPanel(new BorderLayout());
        JPanel rightPanel = new JPanel();

        JButton bt2 = new JButton("3");
        JButton bt3 = new JButton("4");
        JButton bt4 = new JButton("5");
        JButton bt5 = new JButton("6");
        btn1Container.add(rightPanel, BorderLayout.NORTH);
       
        JButton bt1 = new JButton("1");
        bt1.setSize(500, 303);
        bt1.setLocation(350, 25);
        frame.add(bt1);
       
        JButton bt6 = new JButton("3");
        bt6.setSize(250, 150);
        bt6.setLocation(350, 328);
        frame.add(bt6);
       
        JButton bt7 = new JButton("5");
        bt7.setSize(250, 150);
        bt7.setLocation(350, 478);
        frame.add(bt7);
       
        JButton bt8 = new JButton("4");
        bt8.setSize(250, 150);
        bt8.setLocation(600, 328);
        frame.add(bt8);
       
        JButton bt9 = new JButton("5");
        bt9.setSize(250, 150);
        bt9.setLocation(600, 478);
        frame.add(bt9);
       
       
        JPanel btn2Container = new JPanel(new BorderLayout());
        JPanel rightPanel3 = new JPanel(new GridLayout(2, 1));
        JButton rbt1 = new JButton("2");
        JButton rbt2 = new JButton("7");
       
        rightPanel3.add(rbt1);
        rightPanel3.add(rbt2);
        btn2Container.add(rightPanel3);
        btn2Container.setPreferredSize(new Dimension(500, screenSize.height));
        cbContainer.setPreferredSize(new Dimension(200, screenSize.height));
       
        panel3.add(cbContainer, BorderLayout.WEST);
        panel3.add(btn1Container, BorderLayout.CENTER);
        panel3.add(btn2Container, BorderLayout.EAST);
       
        panel2.setPreferredSize(new Dimension(screenSize.width, 100));
       
        frame.setLocationRelativeTo(null);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);
        //frame.pack();
        frame.setVisible(true);
    }
}
