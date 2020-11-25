package src.main.java.lab3.model;

public class Student extends Human {
    private int recordBookNumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", record Book Number='" + recordBookNumber + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int recordBookNumber() {
        return recordBookNumber;
    }

    public void recordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }
}
