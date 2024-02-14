package org.example.z5.service;

import org.example.z5.model.Student;
import org.example.z5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudent implements Service{

    List<Student> listStudents = new ArrayList<>();
    @Override
    public List<Student> read() {
        return listStudents;
    }

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudents.size()+1);
        listStudents.add(student);
        return student;
    }
}
