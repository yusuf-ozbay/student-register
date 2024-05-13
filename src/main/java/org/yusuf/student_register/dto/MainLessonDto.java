package org.yusuf.student_register.dto;

import lombok.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MainLessonDto {
    private UUID id;
    private LessonDto lesson;
    private List<MainLessonStudentDto> mainLessonStudentDtos;
    private UUID teacherId;
    private String name;
    private List<DayOfWeek> daysOfWeek;
    private LocalDate plannedStartDate;
    private LocalDate plannedEndDate;

}
