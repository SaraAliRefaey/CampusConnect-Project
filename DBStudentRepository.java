package campusconnect.repositories;


import campusconnect.models.Student;
import java.util.ArrayList;
import java.util.List;

public class DBStudentRepository implements IStudentRepository {
	
      private List<Student> students = new ArrayList<>();

    //  Overriding 
    public void save(Student student) {
        students.add(student);
        
        System.out.println("Your Data has been saved");
    }

    // overriding
    public Student findByID(String id) 
    {
        return students.stream()
                .filter(s -> s.getStudentID().equals(id))
                .findFirst()
                .orElse(null);
    }

    // overriding
    
    public Student findByName(String name)
    { 
    	return null; 
    	}
}