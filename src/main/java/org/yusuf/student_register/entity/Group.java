package org.yusuf.student_register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;


import java.time.LocalDateTime;
import java.util.List;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grp")
public class Group extends BaseEntity  {

    private String name;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createDate;



    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<GroupStudent> groupStudents;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_lesson_id")
    private MainLesson mainLesson;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<EventLesson> eventLessons;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<PrivateLesson> privateLessons;

}
