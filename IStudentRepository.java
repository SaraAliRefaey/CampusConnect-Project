package campusconnect.repositories;

import campusconnect.models.Student;



public interface IStudentRepository {
	
  
	void save(Student student);
    
    Student findByID(String id);
    
    Student findByName(String name);

}

