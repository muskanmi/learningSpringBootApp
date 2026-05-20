package com.codingshuttle.youtube.learningSpringBootApp.repository;

import com.codingshuttle.youtube.learningSpringBootApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
