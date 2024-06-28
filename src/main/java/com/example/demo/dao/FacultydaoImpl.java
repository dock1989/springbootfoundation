package com.example.demo.dao;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacultydaoImpl implements FacultyInterface{

    @Autowired
    FacultyRepo facultyRepo;
    @Override
    public int saveFaculty(Faculty faculty) {
        facultyRepo.save(faculty) ;
        return 1;
    }

    @Override
    public List<Faculty> getData() {
        return facultyRepo.findAll();
    }

    @Override
    public List<Faculty> getDataByName(String name) {
        return facultyRepo.getFacultyByName(name);
    }

    @Override
    public int updateFaculty(Faculty faculty) {
         facultyRepo.save(faculty);
         return 1;
    }


}
