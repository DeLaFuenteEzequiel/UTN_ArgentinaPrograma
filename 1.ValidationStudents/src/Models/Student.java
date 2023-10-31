package Models;

public class Student {
	
	Integer student_id;
	String document;
	String name;
	String surname;
	Subject subjects;
	
	public Student() {
		
	}

	public Student(Integer student_id, String document, String name, String surname, Subject subjects) {
		super();
		this.student_id = student_id;
		this.document = document;
		this.name = name;
		this.surname = surname;
		this.subjects = subjects;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}



}
