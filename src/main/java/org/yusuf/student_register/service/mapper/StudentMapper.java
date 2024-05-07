package org.yusuf.student_register.service.mapper;

import org.yusuf.student_register.dto.StudentDto;
import org.yusuf.student_register.entity.Student;

public class StudentMapper {


    public static Student toEntity(StudentDto studentDto) {

        Student student = new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setJob(studentDto.getJob());
        student.setAge(studentDto.getAge());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        student.setReferance(studentDto.getReference());
        return student;

    }


    public static StudentDto toDto(Student student) {
        return StudentDto
                .builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .age(student.getAge())
                .job(student.getJob())
                .phoneNumber(student.getPhoneNumber())
                .reference(student.getReferance())
                .build();

    }

}
