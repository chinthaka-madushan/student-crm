package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.sercice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.delectStudent(id);
    }
    @PutMapping
    public void updateStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Student> searchStudent(@PathVariable String name){
        return service.findByName(name);
    }
}
