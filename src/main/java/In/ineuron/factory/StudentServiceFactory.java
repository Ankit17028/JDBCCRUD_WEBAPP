package In.ineuron.factory;

import In.ineuron.service.IStudentService;
import In.ineuron.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static IStudentService StudentServiceImpl;

	private StudentServiceFactory() {
	
	}
	
	public static IStudentService getStudentService() {
		
		if (StudentServiceImpl == null) 
			 StudentServiceImpl = new StudentServiceImpl();
			 
		return StudentServiceImpl;
		
		 
	}

}
