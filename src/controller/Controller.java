package controller;

import dto.GroupStream;
import dto.Student;
import dto.StudentGroup;
import service.*;

import java.util.List;

public class Controller {
    private final DataService studentService;
    private final DataService teacherService;
    private final StudentGroupService studentGroupService;
    private final GroupStreamService groupStreamService;

    public Controller(StudentService studentService, TeacherService teacherService, StudentGroupServiceImpl studentGroupService, GroupStreamServiceImpl<GroupStream, Number> groupStreamService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.studentGroupService = studentGroupService;
        this.groupStreamService = groupStreamService;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupService.getGroup(groupNumber);
    }

    public void removeStudent(String lastName, String firstName) {
        studentGroupService.removeStudent(lastName, firstName);
    }

    public void streamListSort(List<GroupStream> groupStream) {
        groupStreamService.streamSort(groupStream);
    }
}
