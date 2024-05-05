package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.PrivateLesson;


import java.util.UUID;

public interface PrivateLessonRepository  extends JpaRepository<PrivateLesson, UUID> {
}
