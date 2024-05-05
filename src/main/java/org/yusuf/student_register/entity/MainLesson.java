package org.yusuf.student_register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MainLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ElementCollection
    private List<DayOfWeek> daysOfWeek;
    private LocalDate plannedStartDate;
    private LocalDate plannedEndDate;


    @OneToOne
    @JoinColumn(name = "lessonId")
    private Lesson lesson;


public MainLesson(Lesson lesson,UUID id){
    this.lesson=lesson;
    this.id=id;
}



}
