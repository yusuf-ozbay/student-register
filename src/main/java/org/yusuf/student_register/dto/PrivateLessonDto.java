package org.yusuf.student_register.dto;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.yusuf.student_register.entity.Group;
import org.yusuf.student_register.entity.Lesson;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrivateLessonDto {

    private UUID privateLessonId;
    private List<LocalDate> dates;
    private LessonDto lesson;
    private GroupDto group;


}
