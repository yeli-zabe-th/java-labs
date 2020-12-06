package src.main.java.lab4.controller;

import src.main.java.lab4.model.Human;
import src.main.java.lab4.model.Student;

public class StudentCreator {


    public Student createStudent(Human human, int recordBookNumber) {


        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());

        student.recordBookNumber(recordBookNumber);
        student.setSex(human.getSex());

        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human typicalHuman = humanCreator.createTypicalHuman();
        Student typicalStudent = createStudent(typicalHuman, 12345678);
        return typicalStudent;
    }

}
