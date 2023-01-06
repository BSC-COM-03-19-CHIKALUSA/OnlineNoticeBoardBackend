package com.example.onlineNoticeBoardBackend.repository;

import com.example.onlineNoticeBoardBackend.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student ,String> {
}
