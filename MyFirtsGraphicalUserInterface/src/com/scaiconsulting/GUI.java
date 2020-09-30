package com.scaiconsulting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label ;

    public GUI() {

        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click me ");


        label = new JLabel("Number of clicks : 0");
        button.addActionListener(this);


        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My first graphic user Interface ");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks:" + count );
    }
}
