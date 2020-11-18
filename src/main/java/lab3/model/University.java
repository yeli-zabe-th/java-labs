package lab3.model;

public class University {

    private String name;
    private int accreditationDegree;
    private String address;
    private String email;

    @Override
    public String toString() {
        return "University{" +
                "name =" + name +
                ", accreditationDegree =" + accreditationDegree +
                ", address ='" + address + '\'' +
                ", email =" + email +
                '}';
    }

}
