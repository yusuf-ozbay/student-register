package org.yusuf.student_register.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yusuf.student_register.dto.TeacherDto;
import org.yusuf.student_register.entity.Teacher;
import org.yusuf.student_register.repository.TeacherRepository;
import org.yusuf.student_register.service.TeacherService;
import org.yusuf.student_register.service.mapper.TeacherMapper;

import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public TeacherDto save(TeacherDto teacherDto) {
        Teacher teacher = TeacherMapper.toEntity(teacherDto);
        teacher = teacherRepository.save(teacher);
        return TeacherMapper.toDto(teacher);
    }

    @Override
    public TeacherDto findById(UUID id) {
        return TeacherMapper.toDto(teacherRepository.findById(id).orElse(null));
    }

    @Override
    public TeacherDto update(UUID id, TeacherDto teacherDto) {
        Teacher teacher= teacherRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("This Entity not found")
        );

        teacher.setFirstName(teacherDto.getFirstName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setAge(teacherDto.getAge());
        teacher.setJob(teacherDto.getJob());
        teacher.setPhoneNumber(teacherDto.getPhoneNumber());
        teacherRepository.save(teacher);
        return TeacherMapper.toDto(teacher);
    }

    @Override
    public void delete(UUID id) {
           teacherRepository.deleteById(id);
    }

    @Override
    public Teacher findEntityById(UUID id) {
        return teacherRepository.findById(id).orElse(null);
    }
}
