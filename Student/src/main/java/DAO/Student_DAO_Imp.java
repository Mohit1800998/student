package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Client;

@Repository
public class Student_DAO_Imp  implements Student_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveStudent(Client student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Client> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Client> query=currentSession.createQuery("from Student", Client.class);
		List<Client> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteStudent(Client student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Client> getStudentByID(Client student) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Client> query=currentSession.createQuery("from Student where student_id=:student_id", Client.class);
		query.setParameter("student_id", student.getStudent_id());
		List<Client> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateStudent(Client student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
