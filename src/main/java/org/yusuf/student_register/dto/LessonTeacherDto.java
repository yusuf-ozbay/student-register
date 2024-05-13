package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonTeacherDto {

    private UUID id;
    private UUID lessonId;
    private String lessonName;
    private UUID teacherId;
    private String teacherName;
    private LocalDate joinDate;
    private boolean activeStatus;

    public LessonTeacherDto(UUID teacherId,LocalDate joinDate, boolean activeStatus){
        this.teacherId=teacherId;
        this.joinDate=joinDate;
        this.activeStatus=activeStatus;
    }
}
