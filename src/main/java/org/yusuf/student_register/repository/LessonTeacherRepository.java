package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.LessonTeacher;


import java.util.UUID;

public interface LessonTeacherRepository  extends JpaRepository<LessonTeacher, UUID> {
}
