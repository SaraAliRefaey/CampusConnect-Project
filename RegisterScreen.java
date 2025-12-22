package campusconnect.views;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import campusconnect.controllers.UserControl;

public class RegisterScreen extends JFrame {
    public RegisterScreen(UserControl controller) {
        setTitle("Student Registration");
        setSize(400, 450);
        setLayout(new GridLayout(7, 2, 5, 5));

        
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JTextField levelField = new JTextField();
        JTextField deptField = new JTextField();

        add(new JLabel("Student ID:")); add(idField);
        add(new JLabel("Full Name:")); add(nameField);
        add(new JLabel("Email:")); add(emailField);
        add(new JLabel("Password:")); add(passField);
        add(new JLabel("Level:")); add(levelField);
        add(new JLabel("Department:")); add(deptField);

        JButton submitBtn = new JButton("Register Now");
        add(new JLabel("")); 
        add(submitBtn);

        submitBtn.addActionListener(e -> {
            Map<String, Object> data = new HashMap<>();
            data.put("id", idField.getText());
            data.put("name", nameField.getText());
            data.put("email", emailField.getText());
            data.put("pass", new String(passField.getPassword()));
            data.put("level", Integer.parseInt(levelField.getText()));
            data.put("dept", deptField.getText());

            controller.register(data); 
            JOptionPane.showMessageDialog(this, "Welcome "+nameField.getText()+ " Your Id is : "+idField.getText());
            new StartScreen(controller); 
            this.dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}