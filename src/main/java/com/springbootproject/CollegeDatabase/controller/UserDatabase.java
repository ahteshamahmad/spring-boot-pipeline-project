package com.springbootproject.CollegeDatabase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserDatabase {
    @GetMapping("/freshers")
    public List<String> getStudent(){
        List<String>student=new ArrayList<>();
        student.add("Md Ahtesham");
        student.add("Debraj");
	student.add("Sanjukta");
	student.add("Diptanu");
        return student;
    }
    @GetMapping("/mentor")
    public List<String> getTeacher(){
        List<String>mentor=new ArrayList<>();
        mentor.add("Baalaaji Natarajan");
        mentor.add("Sampath Kumar");
        mentor.add("Ramasubramanian Thangala Venkatachalam");
        return mentor;
    }
    @GetMapping("/HR")
        public List<String> getClassroom() {
        List<String>HR=new ArrayList<>();
        HR.add("Karthikeyan M");
        HR.add("Krishnapriya Therppagan");
        return HR;
    }
    @GetMapping("/vice-president")
    public String getname(){
        String vp="Victor Johnbritto";
        return vp;
    }
}
