package com.example.demo.controller;

import com.example.demo.model.Faculty;
import com.example.demo.model.Student;
import com.example.service.FacultyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/base")
public class RestController {

    @Autowired
    FacultyServiceImpl facultyService;

     @GetMapping(value = "/health")
    public String health(){
         return "health";
     }

     @GetMapping(value = "/studentList")
    public List<Student> studentList(){
         List<Student> stList = new ArrayList<>();
         stList.add(new Student(1,"Ajay"));
         stList.add(new Student(1,"Ajay"));
         stList.add(new Student(1,"Ajay"));
         stList.add(new Student(1,"Ajay"));
         return stList;
     }

     @PostMapping("/saveFaculty")
    public int saveFaculty(@RequestBody Faculty faculty){
         return facultyService.saveFaculty(faculty);
     }

     @GetMapping("/showFacultyData")
    public List<Faculty> getData(){
         return facultyService.getData();
     }

     @GetMapping("/showFacultyByName")
    public List<Faculty> getDataByName(@RequestParam String name){
         return facultyService.getDataByName(name);
     }

     @PutMapping("/updateFaculty")
    public int updateFaculty(@RequestBody Faculty faculty){
         return facultyService.updateFaculty(faculty);
     }


}
