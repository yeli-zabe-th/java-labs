package src.main.java.lab3.controller;

import src.main.java.lab3.model.Sex;
import src.main.java.lab3.model.Student;

public class StudentCreator {


    public Student createStudent(String name, String surname, String patronymic, int recordBookNumber,
                                 Sex sex) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setPatronymic(patronymic);
        student.recordBookNumber(recordBookNumber);
        student.setSex(sex);

        return student;
    }

}
