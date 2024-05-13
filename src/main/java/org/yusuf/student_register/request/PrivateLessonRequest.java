package org.yusuf.student_register.request;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class PrivateLessonRequest {
    private String name;
    private UUID teacherId;
    private List<LocalDate> dates;
}
