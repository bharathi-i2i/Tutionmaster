package com.ideas2it.tutionmaster.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.tutionmaster.student.model.Student;
import com.ideas2it.tutionmaster.student.repository.StudentRepository;
import com.ideas2it.tutionmaster.student.service.StudentService;

/**
 * <p>
 * This service class contain all the business logic for student module.
 * </p>
 * 
 * @author Bharathidasan.M created on Oct 30, 2019.
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.getOne(id);
	}
}
