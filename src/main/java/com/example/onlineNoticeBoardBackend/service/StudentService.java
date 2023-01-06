package com.example.onlineNoticeBoardBackend.service;

import com.example.onlineNoticeBoardBackend.repository.StudentRepository;
import com.example.onlineNoticeBoardBackend.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
//    public void deleteStudentById(String email){studentRepository.deleteById(email);}
}
