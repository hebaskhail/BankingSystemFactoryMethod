/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bankingsystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hebaskhail
 */
public class BankingSystem {

    private static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame= new JFrame("Online Banking System");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(700, 500);

        showHomePage(mainFrame);

    }

    public static void showHomePage(JFrame frame) {
        JPanel panel = new JPanel();

        JButton newAccountButton = new JButton("Open New Account");
        JButton loanButton = new JButton("Apply For Loan");
        JButton creditCardButton = new JButton("Request Credit Card"); 

        // Button Actions to Load Specific Forms
        newAccountButton.addActionListener(e -> {
            Form form = new OpenNewAccountForm();
            form.displayForm(frame);
        });

        loanButton.addActionListener(e -> {
            Form form = new ApplyForLoanForm();
            form.displayForm(frame);
        });

         creditCardButton.addActionListener(e -> {
            Form form = new RequestCreditCardForm(); 
            form.displayForm(frame);
        });
         
        panel.add(newAccountButton);
        panel.add(loanButton);
        panel.add(creditCardButton);

        frame.setContentPane(panel);
        frame.revalidate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static JFrame getMainFrame() {
        return mainFrame;
    }
}
