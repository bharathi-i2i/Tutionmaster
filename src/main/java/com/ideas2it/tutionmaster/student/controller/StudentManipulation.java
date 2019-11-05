package com.ideas2it.tutionmaster.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.tutionmaster.student.model.Student;
import com.ideas2it.tutionmaster.student.service.StudentService;

/**
 * <p>
 * Student attendance and all other details about students have been manipulated.
 * </p>
 * @author M.Bharathidasan oct 30, 2019
 *
 */
@RestController
public class StudentManipulation {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * <p>
	 * It used to Register the student.
	 * </p>
	 * 
	 * @return student.
	 */
	@PostMapping("/students/register")
	public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
		Student newStudent = new Student();
		newStudent.setName(student.getName());
		newStudent.setStandard(student.getStandard());
		newStudent.setIsStudentPresent(student.getIsStudentPresent());
		newStudent.setSubject(student.getSubject());
		return new ResponseEntity<Student>
		           (studentService.addStudent(newStudent), HttpStatus.OK);
	}
	
	/**
	 * <p>
	 * It used to display all students.
	 * </p>
	 * 
	 * @return list of students.
	 */
	@GetMapping("/students/display")
	public ResponseEntity<List<Student>> displayStudents() {
		List<Student> students = studentService.getStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	/**
	 * <p>
	 * It used to delete the student.
	 * </p>
	 * 
	 * @param id
	 * @return deleted student.
	 */
	@DeleteMapping("/students/delete/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id) {
		Student student = studentService.getStudentById(id);
		student.setIsStudentPresent(false);
		return new ResponseEntity<Student>
		           (studentService.updateStudent(student), HttpStatus.OK);
	}
	
	/**
	 * <p>
	 * It used to update the student.
	 * </p>
	 * 
	 * @param student
	 * @return updated student.
	 */
	@PutMapping("/students/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		Student newStudent = studentService.getStudentById(student.getId());
		newStudent.setName(student.getName());
		newStudent.setIsStudentPresent(student.getIsStudentPresent());
		newStudent.setStandard(student.getStandard());
		newStudent.setSubject(student.getSubject());
		return new ResponseEntity<Student>
		           (studentService.addStudent(newStudent), HttpStatus.OK);
	}
}
