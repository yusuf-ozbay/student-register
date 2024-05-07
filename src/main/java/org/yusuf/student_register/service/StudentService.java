package org.yusuf.student_register.service;

import org.yusuf.student_register.dto.StudentDto;

import java.util.UUID;

public interface StudentService {

    StudentDto save(StudentDto studentDto);
    StudentDto findById(UUID id);

    void delete (UUID id);
    StudentDto update(StudentDto studentDto,UUID id);

}
