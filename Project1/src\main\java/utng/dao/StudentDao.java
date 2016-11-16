package utng.dao;

import java.util.List;

import utng.model.Student;

public interface StudentDao {
	void add(Student student);
	void edit(Student student);
	void delete(int studentId);
	Student getStudent(int studentId);
	List<Student> getAllStudent();
}
