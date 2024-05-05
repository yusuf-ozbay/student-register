package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupDto {

    private UUID id;
    private String name;
    private List<GroupStudentDto> groupStudents;
    private LocalDateTime createdDate;
}
