package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventLessonDto {
    private UUID eventLessonId;
    private LessonDto lesson;
    private GroupDto group;
    private LocalDate date;
}
