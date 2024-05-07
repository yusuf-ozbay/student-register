package org.yusuf.student_register.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yusuf.student_register.controller.mapper.StudentMapper;
import org.yusuf.student_register.request.StudentRequest;
import org.yusuf.student_register.response.StudentResponse;
import org.yusuf.student_register.service.StudentService;

import java.util.UUID;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody StudentRequest studentRequest) {

        return StudentMapper.toRespose(studentService.save(StudentMapper.toDto(studentRequest)));

    }

    @GetMapping("/getById/{id}")
    public StudentResponse getStudentById(@PathVariable UUID id) {

        return StudentMapper.toRespose(studentService.findById(id));
    }

    @PutMapping("/update/{id}")
    public StudentResponse uptadeStudent(@PathVariable UUID id, @RequestBody StudentRequest studentRequest) {
        return StudentMapper.toRespose(studentService.update(StudentMapper.toDto(studentRequest),id));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable UUID id){
        studentService.delete(id);

        return "DELETED :" +id;
    }

}
