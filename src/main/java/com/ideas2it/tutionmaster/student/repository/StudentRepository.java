package com.ideas2it.tutionmaster.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideas2it.tutionmaster.student.model.Student;

/**
 * <p>
 * This is the repository class for communicate link between server side and 
 * database. This class used to perform all the invoice module action in
 * database. In query annotation (nativeQuery = true) the below query perform
 * like SQL. Otherwise its perform like HQL default value for nativeQuery FALSE
 * </p>
 * 
 * @author Bharathidasan.M created on Oct 30, 2019.
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
