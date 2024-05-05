package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupStudentDto {

    private UUID id;
    private UUID studentId;
    private String studentFullName;
    private UUID groupId;
    private String groupName;
    private LocalDate joinDate;
    private boolean activeStatus;

}
