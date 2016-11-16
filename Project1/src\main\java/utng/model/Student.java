package utng.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity 
public class Student {
	@Id @Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	@Column(length=30)
	private String firstname;
	@Column(length=40)
	private String lastname;
	@Column(name="year_level")
	private int yearLevel;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String firstname, String lastname, int yearLevel) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearLevel = yearLevel;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
}
