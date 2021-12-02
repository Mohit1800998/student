package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Student_DAO;
import Model.Client;

@Service
@Transactional
public class Student_Service_Imp implements Student_Service {
 
	@Autowired
	private Student_DAO studentdao;
	
	@Override
	public boolean saveStudent(Client student) {
		return studentdao.saveStudent(student);
	}

	@Override
	public List<Client> getStudents() {
		return studentdao.getStudents();
	}

	@Override
	public boolean deleteStudent(Client student) {
		return studentdao.deleteStudent(student);
	}

	@Override
	public List<Client> getStudentByID(Client student) {
		return studentdao.getStudentByID(student);
	}

	@Override
	public boolean updateStudent(Client student) {
		return studentdao.updateStudent(student);
	}

}
