package src.main.java.lab3.model;

import src.main.java.lab3.Utils;
import src.main.java.lab3.exceptions.MaxStudentExceed;
import src.main.java.lab3.model.Student;

import java.util.List;

public class Group extends University {

    private int maxStudentsCount;
    List<Student> students;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name +
                ", maxStudentsCount=" + maxStudentsCount +
                ", head=" + head +
                ", students=" + Utils.listToString(students, 5) +
                '}';
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) throws MaxStudentExceed {
        if (students.size() > this.maxStudentsCount) {
            throw new MaxStudentExceed("Max students count was exceeded.");
        }
        this.students = students;
    }

    public void addStudent(Student student) throws MaxStudentExceed {
        this.students.add(student);

        if (this.students.size() > this.maxStudentsCount) {
            throw new MaxStudentExceed("Max students count was exceeded.");
        }
    }

    public int getMaxStudentsCount() {
        return maxStudentsCount;
    }

    public void setMaxStudentsCount(int maxStudentsCount) {
        this.maxStudentsCount = maxStudentsCount;
    }
}
