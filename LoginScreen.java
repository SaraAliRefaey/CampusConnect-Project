

package campusconnect.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import campusconnect.controllers.UserControl;

public class LoginScreen extends JFrame {
	
   
	private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private UserControl controller; // to call Control 

    public LoginScreen(UserControl controller) {
        this.controller = controller;
        

         setTitle("CampusConnect - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Email button
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 100, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 50, 200, 30);
        add(emailField);

        
        // password button 
        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        add(passwordField);

        // Login button 
        
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 160, 100, 40);
        add(loginButton);

        
        loginButton.addActionListener(new ActionListener()
           {
        	
            // overriding 
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

       
                controller.handleLogin(email, password); // Calling function [ login screen ]
                
                JOptionPane.showMessageDialog(null, "Logging in to : " + email);
            }
        });

        setVisible(true);
    }
}