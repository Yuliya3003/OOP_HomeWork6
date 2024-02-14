package org.example.z5.service;

import org.example.z5.model.Teacher;
import org.example.z5.model.User;

import java.util.List;

public interface TeacherService {
    List<Teacher> read();
    Teacher create(User user);
}
