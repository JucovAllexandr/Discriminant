package com.discriminant.ui;

import javax.swing.*;

public class main {
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel panel1;

    public static void main(String []args){
        JFrame frame = new JFrame("Discriminant");
        frame.setContentPane(new main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
