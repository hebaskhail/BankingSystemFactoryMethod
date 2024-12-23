/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

import javax.swing.*;

/**
 *
 * @author hebaskhail
 */
public class OpenNewAccountForm extends Form {

   protected void addSpecificFields(JPanel panel) {
        // Add specific fields for Open New Account
        panel.add(new JLabel("Account Type:"));
        panel.add(new JComboBox<>(new String[]{"Savings", "Checking"}));
        panel.add(new JLabel("Initial Deposit:"));
        panel.add(new JTextField(10));
    }

    @Override
    protected void onSubmit() {
        JOptionPane.showMessageDialog(null, "Open New Account form submitted successfully!");
    }
}
