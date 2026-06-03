package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Student,Integer> {
    List<Student> getStudentByGenderAndTech(String gender, String tech);

    List<Student> getStudentByTech(String tech);

//    @Query(nativeQuery = true,
//    value = "SELECT * from student where gender=:gender AND tech=:tech ")
    @Query("SELECT s FROM Student s WHERE s.gender = :gender AND s.tech = :tech")
    List<Student> findByGenderAndTech(String gender, String tech); // No @Param needed

}
