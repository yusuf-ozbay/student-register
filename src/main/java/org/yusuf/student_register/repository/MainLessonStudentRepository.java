package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.MainLessonStudent;

import java.util.UUID;

public interface MainLessonStudentRepository extends JpaRepository<MainLessonStudent, UUID> {
    MainLessonStudent findMainLessonStudentByMainLessonIdAndStudentId(UUID mainLesson, UUID studentId);

}
