package src.main.java.lab3.controller;

import com.github.javafaker.Faker;
import src.main.java.lab3.controller.UniversityInteractorsControllers.StudentController;
import src.main.java.lab3.controller.UniversityInteractorsControllers.UnitHeadController;
import src.main.java.lab3.controller.universityUnitsControllers.DepartmentController;
import src.main.java.lab3.controller.universityUnitsControllers.FacultyController;
import src.main.java.lab3.controller.universityUnitsControllers.GroupController;
import src.main.java.lab3.controller.universityUnitsControllers.UniversityController;
import src.main.java.lab3.model.Sex;
import src.main.java.lab3.model.Student;
import src.main.java.lab3.model.Head;
import src.main.java.lab3.model.Department;
import src.main.java.lab3.model.Faculty;
import src.main.java.lab3.model.Group;
import src.main.java.lab3.model.University;

import java.util.ArrayList;
import java.util.Random;

public class UniversityCreator extends University {

    @Override
    public University run() {
        try {
            return generateUniversityRandomly();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public University generateUniversityRandomly() throws Exception {
        Random random = new Random();
        Faker faker = new Faker(); // docs: https://dius.github.io/java-faker/apidocs/com/github/javafaker/Faker.html

        UniversityController universityController = new UniversityController();

        // uncomment to see fun fact about Chuck Norris, have fun
        // System.out.println(faker.chuckNorris().fact());

        int maxFacultyCount = random.nextInt(10);
        return universityController.createUniversity(
                faker.funnyName().name(),
                faker.address().fullAddress(),
                createUnitHead(),
                random.nextInt(5),
                maxFacultyCount,
                createFacultyRandomly(maxFacultyCount)
        );
    }

    public ArrayList<Faculty> createFacultyRandomly(int maxFacultiesCount) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        ArrayList<Faculty> faculties = new ArrayList();

        FacultyController facultyController = new FacultyController();

        for (int i = 0; i < maxFacultiesCount; i++) {
            int maxDepartmentsCount = random.nextInt(10);
            faculties.add(
                    facultyController.createFaculty(
                            faker.animal().name(),
                            maxDepartmentsCount,
                            createUnitHead(),
                            createDepartmentRandomly(maxDepartmentsCount)
                    )
            );

        }
        return faculties;
    }

    public ArrayList<Department> createDepartmentRandomly(int maxDepartmentsCounts) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        ArrayList<Department> departments = new ArrayList();

        DepartmentController departmentController = new DepartmentController();

        for (int i = 0; i < maxDepartmentsCounts; i++) {
            int maxGroupsCount = random.nextInt(10);
            departments.add(
                    departmentController.createDepartment(
                            faker.cat().name(),
                            maxGroupsCount,
                            createUnitHead(),
                            createGroupRandomly(maxGroupsCount)
                    )
            );
        }
        return departments;
    }

    public ArrayList<Group> createGroupRandomly(int maxGroupsCount) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        ArrayList<Group> groups = new ArrayList();

        GroupController groupController = new GroupController();

        for (int i = 0; i < maxGroupsCount; i++) {
            int maxStudentsCount = random.nextInt(10);
            groups.add(
                    groupController.createGroup(
                            faker.dog().name(),
                            maxStudentsCount,
                            createUnitHead(),
                            createStudentsRandomly(maxStudentsCount)
                    )
            );
        }
        return groups;
    }

    public ArrayList<Student> createStudentsRandomly(int maxStudentsCount) {
        Random random = new Random();
        Faker faker = new Faker();
        ArrayList<Student> students = new ArrayList();
        ArrayList<Sex> sexes = new ArrayList();
        sexes.add(Sex.FEMALE);
        sexes.add(Sex.MALE);

        StudentController studentController = new StudentController();

        for (int i = 0; i < maxStudentsCount; i++) {
            students.add(
                    studentController.createStudent(
                            faker.name().firstName(),
                            faker.name().lastName(),
                            faker.name().username(),
                            random.nextInt(5),
                            sexes.get(random.nextInt(2))
                    )
            );
        }
        return students;
    }

    public Student createGroupHeadRandomly() {
        Random random = new Random();
        Faker faker = new Faker();
        ArrayList<Sex> sexes = new ArrayList();
        sexes.add(Sex.FEMALE);
        sexes.add(Sex.MALE);

        StudentController studentController = new StudentController();

        return studentController.createStudent(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                random.nextInt(5),
                sexes.get(random.nextInt(2))
        );
    }


    public UnitHead createUnitHead() {
        Faker faker = new Faker();
        Random random = new Random();
        ArrayList<Sex> sexes = new ArrayList();
        sexes.add(Sex.FEMALE);
        sexes.add(Sex.MALE);

        UnitHeadController unitHeadController = new UnitHeadController();
        return unitHeadController.createUnitHead(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                sexes.get(random.nextInt(2))
        );
    }
}
