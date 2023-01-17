package service;

import dto.StudentGroup;

public interface StudentGroupService {
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void removeStudent(String lastName, String firstName);

    void sortStudents(StudentGroup studentGroup);

}
