package src.main.java.lab3.controller;

import src.main.java.lab3.model.Group;
import src.main.java.lab3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {


    Group createGroup(int countOfStudents, int maxStudentsCount) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setMaxStudentsCount(maxStudentsCount);
        return group;
    }

    Group createTypicalGroup() {
        Group group = createGroup(5, 10);
        return group;
    }

}
