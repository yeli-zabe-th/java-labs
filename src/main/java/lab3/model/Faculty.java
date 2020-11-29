package src.main.java.lab3.model;

import java.util.List;

public class Faculty extends Object {
    private Human boss;
    private int maxDepartmentsCount;
    private List<Department> departments;

    public Human getBoss() {
        return boss;
    }

    public void setBoss(Human boss) {
        this.boss = boss;
    }

    public int getMaxDepartmentsCount() {
        return maxDepartmentsCount;
    }

    public void setMaxDepartmentsCount(int maxDepartmentsCount) {
        this.maxDepartmentsCount = maxDepartmentsCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "boss=" + boss +
                ", maxDepartmentsCount=" + maxDepartmentsCount +
                ", departments=" + departments +
                '}';
    }
}
