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
    private UUID id;

    @OneToOne
    @JoinColumn(name = "lesson_id")
        private Lesson lesson;

    private LocalDate date;

    public EventLesson(Lesson lesson,UUID id)
    {
        this.lesson=lesson;
        this.id=id;
    }

}
