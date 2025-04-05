package com.example.Teachers.controller;

import com.example.Teachers.Model.Teacher;
import com.example.Teachers.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers(){
        List<Teacher> listOfAllTeachers=teacherService.getAllTeachers();
        return ResponseEntity.ok(listOfAllTeachers);
    }

}
