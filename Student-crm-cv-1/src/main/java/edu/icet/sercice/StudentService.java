package edu.icet.sercice;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getStudent();
    void delectStudent(Integer id);

    List<Student> findByName(String name);
}
