package view;

import dto.StudentGroup;
import dto.User;

import java.util.List;

public abstract class GroupView {
    public void showTheBest(List<StudentGroup> studentGroup) {
        System.out.println(findGroup(studentGroup));
    }

    public abstract User findGroup(List<StudentGroup> studentGroup);
}
