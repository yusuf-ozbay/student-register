package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.Lesson;
import org.yusuf.student_register.entity.Student;

import java.util.List;
import java.util.UUID;

public interface LessonRepository  extends JpaRepository<Lesson, UUID> {
    @Override
    List<Lesson> findAll();
    Lesson findByName(String name);
}
