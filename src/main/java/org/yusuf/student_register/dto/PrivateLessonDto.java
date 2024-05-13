package org.yusuf.student_register.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrivateLessonDto {

    private UUID id;
    private LessonDto lesson;
    private UUID teacherId;
    private String name;
    private List<LocalDate> dates;

}
