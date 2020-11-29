package src.main.java.lab3.model;

import java.util.Objects;

public class Student extends Human {
    private int recordBookNumber;



    public int recordBookNumber() {
        return recordBookNumber;
    }

    public void recordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBookNumber=" + recordBookNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return recordBookNumber == student.recordBookNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordBookNumber);
    }
}
