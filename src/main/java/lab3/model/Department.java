package src.main.java.lab3.model;

import src.main.java.lab3.Utils;

import java.util.List;

public class Department  {

    private int maxGroupsCount;
    private List<Group> groups;

    public int getMaxGroupsCount() {
        return maxGroupsCount;
    }

    public void setMaxGroupsCount(int maxGroupsCount) {
        this.maxGroupsCount = maxGroupsCount;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "maxGroupsCount=" + maxGroupsCount +
                ", groups=" + groups +
                '}';
    }
}