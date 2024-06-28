package com.example.demo.repository;

import com.example.demo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty,Integer> {

    @Query("select s from Faculty s where s.name =?1")
    public List<Faculty> getFacultyByName(String name);


//    @Query("update Faculty s set s.name=?1,s.email=?2,s.address=?3 where s.id = ?4")
//    public int updateFaculty(Faculty faculty);
}
