package org.yusuf.student_register.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherRequest {
    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String phoneNumber;
}
