package org.yusuf.student_register.controller.mapper;

import org.yusuf.student_register.dto.TeacherDto;
import org.yusuf.student_register.request.TeacherRequest;
import org.yusuf.student_register.response.TeacherResponse;

public class TeacherMapper {
    public static TeacherResponse toResponse(TeacherDto teacherDto) {
        return TeacherResponse.builder()
                .id(teacherDto.getId())
                .firstName(teacherDto.getFirstName())
                .lastName(teacherDto.getLastName())
                .age(teacherDto.getAge())
                .job(teacherDto.getJob())
                .phoneNumber(teacherDto.getPhoneNumber())
                .build();
    }


    public static TeacherDto toDto(TeacherRequest teacherRequest) {
        return TeacherDto.builder()
                .firstName(teacherRequest.getFirstName())
                .lastName(teacherRequest.getLastName())
                .age(teacherRequest.getAge())
                .job(teacherRequest.getJob())
                .phoneNumber(teacherRequest.getPhoneNumber())
                .build();
    }
}
