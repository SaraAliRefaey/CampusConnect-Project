package campusconnect.controllers;

import  campusconnect.models.Student;
import  campusconnect.repositories.IStudentRepository;
import java.util.Map;

public class UserControl {
	
    private IStudentRepository studentRepo; // Interface depend on (SOLID)

    public UserControl(IStudentRepository repository) {
        this.studentRepo = repository;
    }

    // Register
    public void register(Map<String, Object> data) {
        Student s = new Student(
            (String)data.get("id"), (String)data.get("name"),
            (String)data.get("email"), (String)data.get("pass"),
            (int)data.get("level"), (String)data.get("dept")
        );
        studentRepo.save(s);
        System.out.println("Successful Registeration! Name : "+data.get("name")+ "  , ID : "+data.get("id"));
    }

    // HandleLogin
    public Student handleLogin(String email, String password) {
        System.out.println("Logging in to " + email);
        return null; 
    }
    // Logout
    
    public void logout() { System.out.println("Signed out !");}
    
    
    // Change Password
    public void resetPassword(String email) { System.out.println("The New Password has been sent to " + email); }
}