package org.yusuf.student_register.response;

import lombok.*;
import org.yusuf.student_register.dto.LessonTeacherDto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventLessonResponse {
    private UUID id;
    private List<LessonTeacherDto> lessonTeachers;
    private LocalDate date;
}
