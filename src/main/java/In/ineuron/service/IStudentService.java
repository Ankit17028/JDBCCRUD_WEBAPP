package In.ineuron.service;

import In.ineuron.dto.Student;

public interface IStudentService {

	String save(Student student);//For Creating a record
	
	Student findById(int sid);//For Reading record
	
	String updateById(Student student);//Updating a record
	
	String deleteById(int sid);//Deleting a record
}
