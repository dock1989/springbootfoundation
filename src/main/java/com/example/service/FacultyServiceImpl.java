package com.example.service;

import com.example.demo.dao.FacultyInterface;
import com.example.demo.dao.FacultydaoImpl;
import com.example.demo.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyServiceIfc{

    @Autowired
    FacultydaoImpl facultydao;
    @Override
    public int saveFaculty(Faculty faculty) {
        return facultydao.saveFaculty(faculty);
    }

    @Override
    public List<Faculty> getData() {
        return facultydao.getData();
    }

    @Override
    public List<Faculty> getDataByName(String name) {
        return facultydao.getDataByName(name);
    }

    @Override
    public int updateFaculty(Faculty faculty) {
        return facultydao.updateFaculty(faculty);
    }
}
