package com.jsp.studentmgt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.studentmgt.entity.Student;

public interface StudentReposetory extends JpaRepository<Student, Integer> {

}
