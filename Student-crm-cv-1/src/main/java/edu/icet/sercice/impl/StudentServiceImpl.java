package edu.icet.sercice.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.sercice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;

    @Override
    public void addStudent( Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }

    @Override
    public void delectStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }


}
