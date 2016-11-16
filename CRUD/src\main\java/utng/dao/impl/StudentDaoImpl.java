/**
 * 
 */
package utng.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import utng.dao.StudentDao;
import utng.model.Student;

/**
 * @author tacho
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory session;
	
	/* (non-Javadoc)
	 * @see utng.dao.StudentDao#add(utng.model.Student)
	 */
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	/* (non-Javadoc)
	 * @see utng.dao.StudentDao#edit(utng.model.Student)
	 */
	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	/* (non-Javadoc)
	 * @see utng.dao.StudentDao#delete(int)
	 */
	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));
	}

	/* (non-Javadoc)
	 * @see utng.dao.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int studentId) {
		return (Student)session
				.getCurrentSession()
				.get(Student.class, studentId);
	}

	/* (non-Javadoc)
	 * @see utng.dao.StudentDao#getAllStudent()
	 */
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>)session
				.getCurrentSession()
				.createQuery("from Student").list();
	}

}
