package src.main.java.lab3.model;

public class University {

    public String name;
    public String head;
    private int accreditationDegree;
    private String address;
    private String email;

    @Override
    public String toString() {
        return "University{" +
                "name =" + name +
                "head of University =" + head +
                ", accreditationDegree =" + accreditationDegree +
                ", address ='" + address + '\'' +
                ", email =" + email +
                '}';
    }

}
