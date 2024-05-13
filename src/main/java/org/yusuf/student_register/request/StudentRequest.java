package org.yusuf.student_register.request;

import jakarta.annotation.Nullable;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {
    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String reference="";
    private String phoneNumber;
}
