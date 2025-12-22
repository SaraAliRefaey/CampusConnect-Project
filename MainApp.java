 package campusconnect.main;


import campusconnect.controllers.UserControl;
import campusconnect.repositories.DBStudentRepository;
import campusconnect.views.LoginScreen;
import  campusconnect.views.StartScreen;

public class MainApp {
    public static void main(String []args) {
    	
       
    	DBStudentRepository repo = new DBStudentRepository();

       
        UserControl controller = new UserControl(repo);

    
        new StartScreen(controller);
    
        
        System.out.println("System is running ");
     
       
            }
        
    }

    
    

        