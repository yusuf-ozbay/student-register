package org.yusuf.student_register.response;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String phoneNumber;
}
