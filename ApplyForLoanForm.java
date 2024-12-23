/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hebaskhail
 */
public class ApplyForLoanForm extends Form {
    @Override
    protected void addSpecificFields(JPanel panel) {
        // Add specific fields for Apply For Loan
        panel.add(new JLabel("Loan Amount:"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Loan Term (Years):"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Annual Income:"));
        panel.add(new JTextField(10));
    }

    @Override
    protected void onSubmit() {
        JOptionPane.showMessageDialog(null, "Apply For Loan form submitted successfully!");
    }
}