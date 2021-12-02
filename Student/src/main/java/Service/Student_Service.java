package Service;

import java.util.List;

import Model.Client;

public interface Student_Service {

	
	public boolean saveStudent(Client student);
	public List<Client> getStudents();
	public boolean deleteStudent(Client student);
	public List<Client> getStudentByID(Client student);
	public boolean updateStudent(Client student);
}
