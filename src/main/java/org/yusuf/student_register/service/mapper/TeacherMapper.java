package org.yusuf.student_register.service.mapper;

import org.yusuf.student_register.dto.TeacherDto;
import org.yusuf.student_register.entity.Teacher;

public class TeacherMapper {
    public static Teacher toEntity(TeacherDto teacherDto) {
        Teacher teacher=new Teacher();
        teacher.setFirstName(teacherDto.getFirstName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setAge(teacherDto.getAge());
        teacher.setJob(teacherDto.getJob());
        teacher.setPhoneNumber(teacherDto.getPhoneNumber());

        return teacher;

    }

    public static TeacherDto toDto(Teacher teacher) {

        return TeacherDto
                .builder()
                .id(teacher.getId())
                .firstName(teacher.getFirstName())
                .lastName(teacher.getLastName())
                .age(teacher.getAge())
                .job(teacher.getJob())
                .phoneNumber(teacher.getPhoneNumber())
                .build();
    }
}
