package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.Teacher;

import java.util.UUID;

public interface TeacherRepository  extends JpaRepository<Teacher, UUID> {
}
