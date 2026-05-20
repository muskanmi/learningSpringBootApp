package com.codingshuttle.youtube.learningSpringBootApp.service;

import com.codingshuttle.youtube.learningSpringBootApp.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.learningSpringBootApp.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}
