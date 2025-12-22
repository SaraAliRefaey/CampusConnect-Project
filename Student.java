package campusconnect.models;


import java.util.Map;

public class Student {
	
    // Attributes : 
	
    private String studentID;
    private String name;
    private String email;
    private String passwordHash;
    private int level;
    private String department;

    //  Parameter Constructor
    
    public Student(String studentID, String name, String email, String passwordHash, int level, String department) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.level = level;
        this.department = department;
    }

    // Methods 
    public void modifyProfile(Map<String, Object> data) {
    	
        if (data.containsKey("name")) 
        	{
        	this.name = (String) data.get("name");
        	}
        
        if (data.containsKey("level")) {
        	this.level = (int) data.get("level");
        }
        
        System.out.println( this.name + " , Your Profile is Updated");
    }

    // Getters => To Read Data From Controllers
    
    public String getEmail() { 
       	return email; 
    	}
    public String getPasswordHash() { 
       	return passwordHash; 
    	}
    public String getStudentID() {
        	return studentID; 
    	
    }
}

