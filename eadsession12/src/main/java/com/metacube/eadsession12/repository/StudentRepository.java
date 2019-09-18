package com.metacube.eadsession12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metacube.eadsession12.model.Student;

/**
 * This is the Data Access layer. There is no need for any dao implementation.
 * This is an interface.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	/**
	 * No need to define findAll() here, because inherited from JpaRepository
	 * with many other basic JPA operations.
	 **/
	// public List<Product> findAll();

	/**
	 * spring-jpa-data understands this method name, because it supports the
	 * resolution of specific keywords inside method names.
	 **/
	public List<Student> findByFirstNameContainingIgnoreCase(String searchString);

	public List<Student> findByEmailContainingIgnoreCase(String searchString);

}
