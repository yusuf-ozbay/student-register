package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.MainLesson;


import java.util.UUID;

public interface MainLessonRepository  extends JpaRepository<MainLesson, UUID> {
}
