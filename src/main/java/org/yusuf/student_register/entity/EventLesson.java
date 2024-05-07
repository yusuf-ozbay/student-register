package org.yusuf.student_register.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventLesson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID eventLessonId;

    @OneToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;

    private LocalDate date;




    public EventLesson(Lesson lesson, UUID eventLessonId) {
        this.lesson = lesson;
        this.eventLessonId = eventLessonId;
    }

}
