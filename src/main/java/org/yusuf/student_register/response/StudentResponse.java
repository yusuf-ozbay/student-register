package org.yusuf.student_register.response;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String reference;
    private String phoneNumber;

    //gruba girdiği zaman gösterilebilir
}
