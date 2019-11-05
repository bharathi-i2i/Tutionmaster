package com.ideas2it.tutionmaster.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
	private int id;
	
    @Column(name = "name")
	private String name;
    
    @Column(name = "standard")
	private int standard;
    
    @Column(name = "subject")
	private String subject;
    
    @Column(name = "is_student_present")
	private boolean isStudentPresent;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean getIsStudentPresent() {
		return isStudentPresent;
	}
	public void setIsStudentPresent(boolean isStudentPresent) {
		this.isStudentPresent = isStudentPresent;
	}
}
