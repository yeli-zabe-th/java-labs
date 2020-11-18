package lab3.model;

public class Student extends Human {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", surname='" + surname + '\'' +
                ", fathersName='" + patronymic + '\'' +
                ", sex=" + sex +
                '}';
    }
}
