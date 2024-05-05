package org.yusuf.student_register.request;

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
public class MainLessonRequest {
    private String name;
    private UUID teacherId;
    private List<DayOfWeek> daysOfWeek;
    private LocalDate plannedStartDate;
    private LocalDate plannedEndDate;
}
