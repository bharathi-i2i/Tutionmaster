package com.ideas2it.tutionmaster.student.service;

import java.util.List;

import com.ideas2it.tutionmaster.student.model.Student;

/**
 * <p>
 * This is an interface class for student module you can implemented this class in any
 * class.
 * </p>
 * 
 * @author Bharathidasan.M created on oct 30, 2019.
 *
 */
public interface StudentService {

	/**
	 * <p>
	 * add student.
	 * </p>
	 * 
	 * @param student
	 * @return saved student object.
	 */
	Student addStudent(Student student);

	/**
	 * <p>
	 * get students list.
	 * </p>
	 * 
	 * @return student list.
	 */
	List<Student> getStudents();

	/**
	 * <p>
	 * get student by student id.
	 * </p>
	 * 
	 * @param id
	 * @return student object.
	 */
	Student getStudentById(int id);

	/**
	 * <p>
	 * update student.
	 * </p>
	 * 
	 * @param student
	 * @return updated student object.
	 */
	Student updateStudent(Student student);
}
