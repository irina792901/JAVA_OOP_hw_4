package service;

import dto.StudentGroup;
import dto.User;

public interface DataService<U extends User> {
    void create(User user);

    User read(User user);

    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void sortUsers(StudentGroup studentGroup);

    void sortUsersByName(StudentGroup studentGroup);
}
