//package com.example.demo.service;
//
//import com.example.demo.model.Student;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
//@Service
//public class StudentService {
//
//    // Student list
//    List<Student> studentList = new ArrayList<>( Arrays.asList(
//            new Student(1,"Tony Stark \uD83E\uDDB8","Nano Tech \uD83E\uDDBE"),
//            new Student(2,"Bruce Banner \uD83E\uDDB8","Bio Tech \uD83E\uDDDF\u200D"),
//            new Student(3,"Peter Parker \uD83E\uDDB8","Entomology \uD83D\uDD77")
//
//    ));
//
//    //Get all Students
//    public List<Student> getAllStudents() {
//        return studentList;
//    }
//
//    //Get Student by Id
//    public String getStudentByRno(int rno) {
//        //Logic to get the student with given Id
//        for (Student s:studentList){
//            if(s.getRno()==rno){
//                return s.toString();
//            }
//        }
//        //Returing the empty Student if Student not found
//        return "Student NOt Found";
//    }
//
//    // Adding new Student for post Mapping
//    public Student addstudent(Student student) {
//        studentList.add(student);
//        return student;
//    }
//
//    // update existing Student for Put Mapping
//    public String updateStudent(int rno, Student student) {
//        // Logic to get user by Id to update
//        for(int i=0;i<studentList.size();i++){
//            if(studentList.get(i).getRno()==rno){
//                studentList.set(i,student);
//                return "Updated Successfully";
//            }
//        }
//        return "Student Not Found";
//
//
//    }
//
//
//    public String deleteStudent(int rno) {
//        for(int i=0;i<studentList.size();i++){
//            if(studentList.get(i).getRno()==rno){
//                studentList.remove(i);
//                return "Deleted Successfully";
//            }
//        }
//        return "Student Not Found";
//
//    }
//}
