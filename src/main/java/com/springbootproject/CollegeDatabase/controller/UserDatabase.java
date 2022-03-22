package com.springbootproject.CollegeDatabase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserDatabase {
    @GetMapping("/student")
    public List<String> getStudent(){
        List<String>student=new ArrayList<>();
        student.add("Md Ahtesham");
        student.add("Md Nawaz");
        return student;
    }
    @GetMapping("/mentor")
    public List<String> getTeacher(){
        List<String>mentor=new ArrayList<>();
        mentor.add("Deepak Kumar");
        mentor.add("Jayanta Mukherjee");
        mentor.add("Suman Das");
        return mentor;
    }
    @GetMapping("/HR")
        public List<String> getClassroom() {
        List<String>HR=new ArrayList<>();
        HR.add("Soumyajit Chatterjee");
        HR.add("Sugata Kundu");
        HR.add("Sreetama Banerjee");
        return HR;
    }
    @GetMapping("/vice-president")
    public String getname(){
        String vp="Srinivas Mukkammala";
        return vp;
    }
}
