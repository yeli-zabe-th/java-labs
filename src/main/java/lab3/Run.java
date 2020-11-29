package src.main.java.lab3;

import src.main.java.lab3.controller.UniversityCreator;
import src.main.java.lab3.model.University;

public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }

}
