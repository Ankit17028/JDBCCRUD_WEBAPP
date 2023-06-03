package In.ineuron.dao;

import In.ineuron.dto.Student;

public interface IStudentDao {

	String save(Student student);//For Creating a record
	
	Student findById(int sid);//For Reading record
	
	String updateById(Student student);//Updating a record
	
	String deleteById(int sid);//Deleting a record

}
