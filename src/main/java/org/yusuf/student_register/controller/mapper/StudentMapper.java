package org.yusuf.student_register.controller.mapper;

import org.yusuf.student_register.dto.StudentDto;
import org.yusuf.student_register.request.StudentRequest;
import org.yusuf.student_register.response.StudentResponse;

public class StudentMapper {


    public static StudentResponse toRespose(StudentDto studentDto) {
        return StudentResponse
                .builder()
                .id(studentDto.getId())
                .firstName(studentDto.getFirstName())
                .lastName(studentDto.getLastName())
                .age(studentDto.getAge())
                .job(studentDto.getJob())
                .phoneNumber(studentDto.getPhoneNumber())
                .reference(studentDto.getReference())
                .build();
    }

    public static StudentDto toDto(StudentRequest studentRequest) {
        return StudentDto
                .builder()
                .firstName(studentRequest.getFirstName())
                .lastName(studentRequest.getLastName())
                .reference(studentRequest.getReference())
                .phoneNumber(studentRequest.getPhoneNumber())
                .job(studentRequest.getJob())
                .age(studentRequest.getAge())
                .build();
    }
}
