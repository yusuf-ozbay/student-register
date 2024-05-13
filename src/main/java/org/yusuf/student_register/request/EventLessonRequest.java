package org.yusuf.student_register.request;

import java.time.LocalDate;
import java.util.UUID;

public class EventLessonRequest {
    private String name;
    private UUID teacherId;
    private LocalDate date;
}
