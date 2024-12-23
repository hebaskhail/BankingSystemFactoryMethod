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

public class RequestCreditCardForm extends Form {
    @Override
    protected void addSpecificFields(JPanel panel) {
       
        panel.add(new JLabel("Card Type:"));
        panel.add(new JComboBox<>(new String[] {"Platinum", "Gold", "Standard"}));
        panel.add(new JLabel("Credit Limit Requested:"));
        panel.add(new JTextField(10));       
    }


    @Override
    protected void onSubmit() {
        JOptionPane.showMessageDialog(null, "Request Credit Card successfully!");
    }
 

 
}