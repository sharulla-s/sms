package com.sharulla.Studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharulla.Studentmanagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}