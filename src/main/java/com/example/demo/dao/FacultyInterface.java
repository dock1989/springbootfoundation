package com.example.demo.dao;

import com.example.demo.model.Faculty;

import java.util.List;

public interface FacultyInterface {

    public int saveFaculty(Faculty faculty);

    List<Faculty> getData();

    List<Faculty> getDataByName(String name);

    int updateFaculty(Faculty faculty);
}
