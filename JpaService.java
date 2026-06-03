package com.example.demo.service;

import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaService {

    @Autowired
    Repo repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public ResponseEntity<Student> getStudentById(int rno) {

        Student student =  repo.findById(rno).orElseThrow(() ->
                new StudentNotFoundException("Student with id not found")
                );
        return ResponseEntity.ok(student);
    }

    public String addStudent(Student student) {
        repo.save(student);
        return "Student added Successfully";
    }

    public String updateStudent(int rno,Student student) {
      Optional<Student> s= repo.findById(rno);
      if(s.isPresent()){
      Student student1 = s.get();
      student1.setName(student.getName());
      student1.setTech(student.getTech());
      repo.save(student1);
      return "Student updated Successfully";
      }
      return "Error while adding Student";
    }

    public String deleteStudent(int rno) {

        repo.deleteById(rno);
        return "Student Deleted Successfully";

    }

    public String deleteAllStudents(){
        repo.deleteAll();
        return "All data Deleted Successfully";
    }


    public List<Student> getUserByGenderAndTech(String gender,String tech) {
        return repo.getStudentByGenderAndTech(gender, tech);
    }

    public List<Student> getStudentByTech(String tech) {
        return repo.getStudentByTech(tech);
    }


    public List<Student> getStudentByGenAndTech(String gender, String tech) {
        return repo.findByGenderAndTech(gender,tech);
    }
}
