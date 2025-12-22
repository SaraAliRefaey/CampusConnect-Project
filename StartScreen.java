package campusconnect.views;

import javax.swing.*;
import java.awt.*;
import  campusconnect.controllers.UserControl;

public class StartScreen extends JFrame {
    public StartScreen(UserControl controller) {
        setTitle("CampusConnect - Welcome");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1, 10, 10)); 
        
        JButton loginBtn = new JButton("Login (Sign In)");
        JButton registerBtn = new JButton("Register (New Student)");

        add(loginBtn);
        add(registerBtn);

       
        loginBtn.addActionListener(e -> {
            new LoginScreen(controller);
            this.dispose(); 
        });

   
        
        registerBtn.addActionListener(e -> {
            new RegisterScreen(controller);
            this.dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}