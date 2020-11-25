package src.main.java.lab3.model;

import src.main.java.lab3.Utils;
import src.main.java.lab3.exceptions.MaxGroupExceed;

import java.util.List;

public class Department extends University {

    private int maxGroupsCount;
    private List<Group> groups;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name +
                ", head=" + head +
                ", maxGroupsCount=" + maxGroupsCount +
                ", groups=" + Utils.listToString(groups, 4) +
                '}';
    }

    // groups
    public List<Group> getGroups() {
        return this.groups;
    }

    public void setGroups(List<Group> groups) throws MaxGroupExceed {
        if (groups.size() > this.maxGroupsCount) {
            throw new MaxGroupExceed("Max group count exceeded");
        }
        this.groups = groups;
    }

    public void addGroup(Group group) throws MaxGroupExceed {
        this.groups.add(group);

        if (this.groups.size() > this.maxGroupsCount) {
            throw new MaxGroupExceed("Max group count exceeded");
        }
    }


    // max faculties count
    public int getMaxGroupsCount() {
        return this.maxGroupsCount;
    }

    public void setMaxGroupsCount(int maxGroupCount) {
        this.maxGroupsCount = maxGroupCount;
    }

}
