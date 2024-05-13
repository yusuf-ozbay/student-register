package org.yusuf.student_register.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yusuf.student_register.dto.StudentDto;
import org.yusuf.student_register.entity.Student;
import org.yusuf.student_register.repository.StudentReopsitory;
import org.yusuf.student_register.service.StudentService;
import org.yusuf.student_register.service.mapper.StudentMapper;

import java.util.UUID;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentReopsitory studentReopsitory;

    @Override
    public StudentDto save(StudentDto studentDto) {

        Student student = StudentMapper.toEntity(studentDto);
        student = studentReopsitory.save(student);
        return StudentMapper.toDto(student);
    }

    @Override
    public StudentDto findById(UUID id) {
        return StudentMapper.toDto(studentReopsitory.findById(id).orElse(null));
    }


    @Override
    public void delete(UUID id) {
        studentReopsitory.deleteById(id);
    }

    @Override
    public StudentDto update(StudentDto studentDto, UUID id) {

        Student student = studentReopsitory.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("this entity not found")
        );


        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setAge(studentDto.getAge());
        student.setJob(studentDto.getJob());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        student.setReferance(studentDto.getReference());
        studentReopsitory.save(student);
        return StudentMapper.toDto(student);
    }

    @Override
    public Student findEntityById(UUID id) {
        return studentReopsitory.findById(id).orElse(null);
    }

}
