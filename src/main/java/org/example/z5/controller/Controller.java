package org.example.z5.controller;

import org.example.z5.model.Group;
import org.example.z5.model.Student;
import org.example.z5.model.Teacher;
import org.example.z5.model.User;
import org.example.z5.service.DataStudent;
import org.example.z5.service.DataTeacher;
import org.example.z5.service.GroupService;
import org.example.z5.view.StudentView;

import java.util.List;

//� Создать package – controller. Работу продолжаем в нем
//        � Создать класс Controller агрегирующий в себе необходимые классы в виде
//        полей, а инициализируем прям в поле.
//        � Создаем метод созданиеСтудента – реализующий логику, путем вызова
//        соответствующих методов интерфейсов:
//        � Создания Студента в сервисе
//        � Возвращение всех студентов в сервисе
//        � Вызов view и передача списка найденных студентов
public class Controller {
    private DataTeacher dataTeacherService;
    private DataStudent dataStudentService;
    private StudentView view;

    private GroupService groupService;

    public void start(){
        User student1 = new Student("Artem", 26, 4.7);
        User teacher1 = new Teacher("Valerii", 50, "Math");
        User student2 = new Student("Artem", 24, 4.7);
        createStudent(student1);
        createStudent(student2);
        createTeacher(teacher1);
        List<Student> listStudents = dataStudentService.read();
        List<Teacher> listTeacher = dataTeacherService.read();
        view.printStudent(listStudents);
        Group group = createGroup();
        view.printGroup(group);

    }

    public Student createStudent(User user){
        return dataStudentService.create(user);
    }

    public Teacher createTeacher(User user){
        return dataTeacherService.create(user);
    }

    public Group createGroup() {
        List<Student> students = dataStudentService.read();
        Teacher teacher = dataTeacherService.read().get(0);
        return groupService.makeGroup(teacher, students);
    }

    public Controller() {
        dataTeacherService = new DataTeacher();
        dataStudentService = new DataStudent();
        view = new StudentView();
        groupService = new GroupService();
    }
}
