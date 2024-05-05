package org.yusuf.student_register.dto;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String phoneNumber;

}
