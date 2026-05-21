package com.codingshuttle.youtube.learningSpringBootApp.service;

import com.codingshuttle.youtube.learningSpringBootApp.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.learningSpringBootApp.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
