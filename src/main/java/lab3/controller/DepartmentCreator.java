package src.main.java.lab3.controller;

import src.main.java.lab3.model.Department;
import src.main.java.lab3.model.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ominieiev on 25.11.2020.
 */
public class DepartmentCreator {


    public Department createDepartment(int countOfGroups, int maxGroupsCount) {
        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < countOfGroups; i++) {
            groups.add(groupCreator.createTypicalGroup());
        }
        department.setGroups(groups);
        return department;
    }

    public Department createTypicalDepartment() {
        Department department = createDepartment(4, 6);
        return department;
    }
}
