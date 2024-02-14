package org.example.z5.service;

import org.example.z5.model.Student;
import org.example.z5.model.User;

import java.util.List;

public interface Service {
    List<Student> read();
    Student create(User user);
}
