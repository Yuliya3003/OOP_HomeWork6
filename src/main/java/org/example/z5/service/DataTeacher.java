package org.example.z5.service;

import org.example.z5.model.Teacher;
import org.example.z5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacher implements TeacherService{

    List<Teacher> listTeacher = new ArrayList<>();
    @Override
    public List<Teacher> read() {
        return listTeacher;
    }

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(listTeacher.size()+1);
        listTeacher.add(teacher);
        return teacher;
    }
}
