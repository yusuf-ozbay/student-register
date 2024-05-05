package org.yusuf.student_register.dto;

import lombok.*;
import org.yusuf.student_register.entity.LessonTeacher;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonDto {
    private UUID lessonId;
    private String name;
    private List<LessonTeacherDto> lessonTeachers;

}
