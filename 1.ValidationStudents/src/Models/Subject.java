package Models;

import java.util.List;

public class Subject {

	public Subject(Integer subject_id, String name, List<Subject> correlatives) {
		super();
		this.subject_id = subject_id;
		this.name = name;
		this.correlatives = correlatives;
	}

	Integer subject_id;
	String name;
	List<Subject> correlatives;
	
	public Subject() {		
		 
	}


	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
