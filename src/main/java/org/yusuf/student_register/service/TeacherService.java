package org.yusuf.student_register.service;

import org.yusuf.student_register.dto.TeacherDto;
import org.yusuf.student_register.entity.Teacher;

import java.util.UUID;

public interface TeacherService {

    TeacherDto save(TeacherDto teacherDto);
    TeacherDto findById(UUID id);
    TeacherDto update(UUID id,TeacherDto teacherDto);
    void delete(UUID id);

    Teacher findEntityById(UUID id);

}
