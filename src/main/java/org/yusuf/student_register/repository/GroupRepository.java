package org.yusuf.student_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yusuf.student_register.entity.Group;
import org.yusuf.student_register.entity.Student;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
