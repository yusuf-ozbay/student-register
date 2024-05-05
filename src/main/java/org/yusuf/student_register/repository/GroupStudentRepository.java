package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.GroupStudent;
import org.yusuf.student_register.entity.Student;

import java.util.UUID;

public interface GroupStudentRepository  extends JpaRepository<GroupStudent, UUID> {
}
