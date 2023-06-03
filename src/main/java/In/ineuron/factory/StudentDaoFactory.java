package In.ineuron.factory;

import In.ineuron.dao.IStudentDao;
import In.ineuron.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private static IStudentDao studentDao = null;

	private StudentDaoFactory() {

	}
	
	public static IStudentDao getStudentDao() {
		if (studentDao == null) 
			studentDao = new StudentDaoImpl();

		return studentDao;
		
		
	} 
}
