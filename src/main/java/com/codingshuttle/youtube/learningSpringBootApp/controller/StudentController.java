package com.codingshuttle.youtube.learningSpringBootApp.controller;


import com.codingshuttle.youtube.learningSpringBootApp.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.learningSpringBootApp.dto.StudentDto;
import com.codingshuttle.youtube.learningSpringBootApp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudent() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.updateStudent(id, addStudentRequestDto));
    }
}
