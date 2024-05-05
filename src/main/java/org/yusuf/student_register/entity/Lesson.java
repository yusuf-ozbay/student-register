package org.yusuf.student_register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID lessonId;
    private String name;

    @OneToMany(mappedBy = "leson",cascade = CascadeType.ALL)
    private List<LessonTeacher> lessonTeachers;


}
