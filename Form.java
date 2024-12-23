/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hebaskhail
 */
public abstract class Form extends JFrame{
        protected JPanel panel; 

      public Form() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add shared fields
        panel.add(new JLabel("Customer Name:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Customer ID:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Customer Email:"));
        panel.add(new JTextField(10));

        // Add specific form fields via template method
        addSpecificFields(panel);


        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSubmit();
            }
        });
        panel.add(submitButton);

        // Add Return to Home button
        JButton returnButton = new JButton("Return to Home");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onReturn();
            }
        });
        panel.add(returnButton);
    }

   
    protected abstract void addSpecificFields(JPanel panel);

   
    protected abstract void onSubmit();

    protected void onReturn() {
        BankingSystem.showHomePage(BankingSystem.getMainFrame());
    }

    public void displayForm(JFrame frame) {
        frame.setContentPane(panel);
        frame.revalidate();
    }
}