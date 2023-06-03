package In.ineuron.service;

import In.ineuron.dao.IStudentDao;
import In.ineuron.dto.Student;
import In.ineuron.factory.StudentDaoFactory;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studentDao;
	
	@Override
	public String save(Student student) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.save(student);
		
	}

	@Override
	public Student findById(int sid) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.updateById(student);
	}

	@Override
	public String deleteById(int sid) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.deleteById(sid);
	}

}
