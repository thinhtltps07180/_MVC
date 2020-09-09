package tp.demo.mvc;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	@Pattern(regexp = "[^0-9]*")
	private String studentName;
	@Size(min = 2 , max = 30)
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;

	private Address studentAddreess;

	public Student() {
		super();
	}

	public Student(String studentName, String studentHobby, Long studentMobile, Date studentDOB,
			ArrayList<String> studentSkills, Address studentAddreess) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentSkills = studentSkills;
		this.studentAddreess = studentAddreess;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public Address getStudentAddreess() {
		return studentAddreess;
	}

	public void setStudentAddreess(Address studentAddreess) {
		this.studentAddreess = studentAddreess;
	}

}
