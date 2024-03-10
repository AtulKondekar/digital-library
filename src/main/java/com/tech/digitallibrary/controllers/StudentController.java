package com.tech.digitallibrary.controllers;

import com.tech.digitallibrary.entities.Student;
import com.tech.digitallibrary.models.StudentRequestModel;
import com.tech.digitallibrary.models.StudentResponseModel;
import com.tech.digitallibrary.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/")
    private String get(){
        return "Student service is running";
    }

    @PostMapping("/create")
    private StudentResponseModel createStudent(@RequestBody StudentRequestModel student){
        return studentService.createStudent(student);
    }

//    @GetMapping("/get")
//    private List<StudentResponseModel> getAllStudents(){
//
//    }
}
