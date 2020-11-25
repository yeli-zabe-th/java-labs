package src.main.java.lab3.model;

import src.main.java.lab3.Utils;
import src.main.java.lab3.exceptions.MaxDepartmentExceed;

import java.util.List;

public class Faculty extends University {

    private int maxDepartmentsCount;
    List<Department> departments;

    @Override
    public String toString() {
        return "Faculty{" +
                "name=" + name +
                ", head=" + head +
                ", maxDepartmentsCount=" + maxDepartmentsCount +
                ", departments=" + Utils.listToString(departments, 3) +
                '}';
    }

    // departments
    public List<Department> getDepartments() {
        return this.departments;
    }

    public void setDepartments(List<Department> departments) throws MaxDepartmentExceed {
        if (departments.size() > this.maxDepartmentsCount) {
            throw new MaxDepartmentExceed("Max departments count was exceeded.");
        }
        this.departments = departments;
    }

    public void addDepartment(Department department) throws MaxDepartmentExceed {
        this.departments.add(department);

        if (this.departments.size() > this.maxDepartmentsCount) {
            throw new MaxDepartmentExceed("Max departments count was exceeded.");
        }
    }


    // max groups count
    public int getMaxDepartmentsCount() {
        return maxDepartmentsCount;
    }

    public void setMaxDepartmentsCount(int maxDepartmentsCount) {
        this.maxDepartmentsCount = maxDepartmentsCount;
    }


}
