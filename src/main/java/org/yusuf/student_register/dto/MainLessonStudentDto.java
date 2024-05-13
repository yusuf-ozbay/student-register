package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MainLessonStudentDto {
    private UUID id;
    private UUID studentId;
    private String studentName;
    private LocalDate joinDate;
    private boolean activeStatus;

    public MainLessonStudentDto(UUID studentId, LocalDate joinDate, boolean activeStatus) {
        this.studentId = studentId;
        this.joinDate=joinDate;
        this.activeStatus=activeStatus;
    }

}
