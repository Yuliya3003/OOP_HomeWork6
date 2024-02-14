package org.example.z5.service;

import org.example.z5.model.Group;
import org.example.z5.model.Student;
import org.example.z5.model.Teacher;

import java.util.List;

public class GroupService implements GroupManager{
    @Override
    public Group makeGroup(Teacher teacher, List<Student> students) {
        return new Group(teacher, students);
    }
}
