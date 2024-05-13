package org.yusuf.student_register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusuf.student_register.controller.mapper.TeacherMapper;
import org.yusuf.student_register.request.TeacherRequest;
import org.yusuf.student_register.response.TeacherResponse;
import org.yusuf.student_register.service.TeacherService;

import java.util.UUID;


@RestController
@RequestMapping("teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/create")
    public ResponseEntity<TeacherResponse> createStudent(@RequestBody TeacherRequest teacherRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(TeacherMapper.toResponse(teacherService.save(TeacherMapper.toDto(teacherRequest)))) ;
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<TeacherResponse>  getTeacherById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(TeacherMapper.toResponse(teacherService.findById(id))) ;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TeacherResponse> updateTeacher(@PathVariable UUID id, @RequestBody TeacherRequest teacherRequest){

        return ResponseEntity.status(HttpStatus.OK).body( TeacherMapper.toResponse(teacherService.update(id,TeacherMapper.toDto(teacherRequest))));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable UUID id){
        teacherService.delete(id);
        return "DELETED: "+ id;
    }

}
