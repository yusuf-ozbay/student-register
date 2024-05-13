package org.yusuf.student_register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PrivateLesson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "lessonId")
    private Lesson lesson;

    @ElementCollection
    private List<LocalDate> dates;


    public PrivateLesson(Lesson lesson,UUID id)
    {
        this.lesson=lesson;
        this.id=id;
    }

}
