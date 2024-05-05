package org.yusuf.student_register.response;

import lombok.*;
import org.yusuf.student_register.dto.GroupStudentDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupResponse {
    private UUID id;
    private String name;
    private List<GroupStudentDto> groupStudents;
    private LocalDateTime createdDate;
}
